import java.util.*;
class Test
{
  public int usePrimitive(int increment)
  {
    int i=5;
    for (int j=0;j<10000000;j++) {
    i = i + increment;
    }
    return i;
  }
  public int useObject(Integer increment)
  {
    int i=5;
    for (int j=0;j<10000000;j++) {
    i = i + increment.intValue();
    }
    return i;
  }

  public static void main(String args[])
  {
    int val = Integer.parseInt(args[0]);
    Test t = new Test();
    long start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.usePrimitive(10);
    long end = System.currentTimeMillis();
    System.out.println("loop with int vals " + (end-start));

    start = System.currentTimeMillis();
    Integer inc = new Integer(10);
    for (int i=0; i<val; i++)
      t.useObject(inc);
    end = System.currentTimeMillis();
    System.out.println("loop with Integer vals " + (end-start));
  }
}
