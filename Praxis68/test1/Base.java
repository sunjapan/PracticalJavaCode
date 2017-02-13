class Base
{
  private int val;
  Base()
  {
    val = lookup();
  }

  public int lookup()
  {
    //Perform a database lookup
    int num = dbLookup();
    //return num;
    return 5;
  }


  public int value()
  {
    return val;
  }
}