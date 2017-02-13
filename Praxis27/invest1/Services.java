import java.io.IOException;

class MutualFund
{
  public void buyMoreShares(double money)
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
    MutualFund[] array = cust.funds();                        //1
    int size = array.length;

    for (int i=0; i<size; i++)
    {
      ((MutualFund)array[i]).buyMoreShares(money);            //2
      cust.updateMutualFund(array[i]);
      cust.writePortfolioChange();
    }
    //...
  }
}