class Foo extends Thread
{
  private int val;
  public Foo(int v)
  {
    val = v;
  }

  public synchronized void printVal(int v)
  {
    while(true)
      System.out.println(v);
  }

  public void run()
  {
    printVal(val);
  }
}

class Bar extends Thread
{
  private Foo sameFoo;
  public Bar(Foo f)
  {
    sameFoo = f;
  }
  public void run()
  {
    sameFoo.printVal(2);
  }
}

class Test
{
  public static void main(String args[])
  {
    Foo f1 = new Foo(1);
    f1.start();
    Bar b = new Bar(f1);
    b.start();
    Foo f2 = new Foo(3);
    f2.start();
  }
}