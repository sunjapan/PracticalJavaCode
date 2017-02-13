class Foo implements Runnable
{
  private SomeObj someobj;
  public void printM1()
  {
    synchronized(someobj) {
      //The code to protect.
    }
  }

  public static void printM2(Foo f)
  {
    synchronized(f.someobj) {
      //The code to protect.
    }
  }
  //...
}