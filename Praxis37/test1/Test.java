import java.awt.Point;
import java.util.Vector;

class Foo
{     
  private int count;
  private boolean done;
  private Point pt;
  private Vector vec;

  public Foo()
  {
    count = 0;                                                //1
    done = false;
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
      Foo f = new Foo();
    }
    long end = System.currentTimeMillis();
    System.out.println("Foo " + (end-start));
  }
}
