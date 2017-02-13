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

class Derived extends Base
{
  private int num = 10;
  public int lookup()
  {
    return num;
  }
}


class Test
{
  public static void main(String args[])
  {
    Derived d = new Derived();
    System.out.println("From main() d.value() returns " +
                       d.value());
  }
}