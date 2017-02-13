import java.io.IOException;

class MutualFund
{
  public void buyMoreShares(double money)
  {}
  public void sellShares(double money)
  {}
  //...
}

class Customer
{
  private MutualFund[] fundArray;

  public Customer()
  {}

  public MutualFund[] funds()
  {
    return fundArray;
  }

  public void updateMutualFund(MutualFund fund) throws
    DatabaseException
  {}
  public void undoMutualFundUpdate(MutualFund fund)
  {}

  public void writePortfolioChange() throws IOException
  {}
  //...
}

class DatabaseException extends Exception
{}
class Services
{
  public void invest(Customer cust, double money) throws
    IOException, DatabaseException
  {
    MutualFund[] array = cust.funds();
    int size = array.length;

    for (int i=0; i<size; i++)
    {
      ((MutualFund)array[i]).buyMoreShares(money);
      try {
        cust.updateMutualFund(array[i]);
      }
      catch(DatabaseException dbe)  //Catch exception and return
      {                             //object to a valid state.
        ((MutualFund)array[i]).sellShares(money);
        throw dbe;
      }
      try {
        cust.writePortfolioChange();
      }
      catch(IOException ioe)  //Catch exception and return object
      {                       //to a valid state.
        ((MutualFund)array[i]).sellShares(money);
        cust.undoMutualFundUpdate(array[i]);
        throw ioe;
      }
    }
    //...
  }
}