final class PinNumbers
{
  private String acctOwner;
  private int checkingAcctPin;
  private int savingsAcctPin;



  PinNumbers(String owner, int cPin, int sPin)
  {
    acctOwner = owner;
    checkingAcctPin = cPin;
    savingsAcctPin = sPin;
  }
  public String accountOwner()
  {
    return acctOwner;
  }
  public int checkingPin()
  {
    return checkingAcctPin;
  }
  public int savingsPin()
  {
    return savingsAcctPin;
  }
  //...
}