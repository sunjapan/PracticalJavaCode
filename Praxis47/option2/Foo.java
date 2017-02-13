class Foo implements Runnable
{
  private byte[] lock = new byte[0];
  public void printM1()
  {
    synchronized(lock) {
      //The code to protect.
    }
  }

  public static void printM2(Foo f)
  {
    synchronized(f.lock) {
      //The code to protect.
    }
  }
  //...
}