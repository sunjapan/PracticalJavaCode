class Foo implements Runnable
{
  public synchronized void printM1()
  {
    while (true)
      System.out.println("printM1");
  }

  public synchronized static void printM2()
  {
    while (true)
      System.out.println("printM2");
  }
  public void run()
  {
    printM1();
  }
}

class Test
{
  public static void main(String args[])
  {
    Foo f = new Foo();
    Thread t = new Thread(f);
    t.start();
    f.printM2();
  }
}