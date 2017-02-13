import java.awt.Point;
import java.util.Vector;

class Foo2
{
  private int count = 0;
  private boolean done = false;
  private Point pt;
  private Vector vec;

  public Foo2()
  {
    pt = new Point(0,0);
    vec = new Vector(10);
  }
}

class Test
{
  public static void main(String args[])
  {
    System.gc();
    long start = System.currentTimeMillis();
    for (int i=0; i<100000; i++)
    {
      Foo2 f = new Foo2();
    }
    long end = System.currentTimeMillis();
    System.out.println("Foo2 " + (end-start));
  }
}
