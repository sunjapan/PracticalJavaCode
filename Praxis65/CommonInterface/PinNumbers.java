interface PinNumbers
{
  public String accountOwner();
  public int checkingPin();
  public int savingsPin();
}

class MutablePinNumbers implements PinNumbers
{
  private String acctOwner;
  private int checkingAcctPin;
  private int savingsAcctPin;

  MutablePinNumbers(String owner, int cPin, int sPin)
  {
    acctOwner = owner;
    checkingAcctPin = cPin;
    savingsAcctPin = sPin;
  }
  public void setAccountOwner(String str)
  {
    acctOwner = str;
  }


  public String accountOwner()
  {
    return acctOwner;
  }
  public void setCheckingPin(int pin)
  {
    checkingAcctPin = pin;
  }
  public int checkingPin()
  {
    return checkingAcctPin;
  }
  public void setSavingsPin(int pin)
  {
    savingsAcctPin = pin;
  }
  public int savingsPin()
  {
    return savingsAcctPin;
  }
}

final class ImmutablePinNumbers implements PinNumbers
{
  private String acctOwner;
  private int checkingAcctPin;
  private int savingsAcctPin;

  ImmutablePinNumbers(String owner, int cPin, int sPin)
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
}