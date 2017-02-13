import java.util.*;

class Test
{
  public int enumVec(Vector vec)
  {
    Enumeration enum = vec.elements();
    int total = 0;
    while(enum.hasMoreElements())
      total += ((Integer)(enum.nextElement())).intValue();
    return total;
  }
  public int iterVec(Vector vec)
  {
    Iterator iter = vec.iterator();
    int total = 0;
    while(iter.hasNext())
      total += ((Integer)(iter.next())).intValue();
    return total;
  }
  public int listIterVec(Vector vec)
  {
    ListIterator iter = vec.listIterator();
    int total = 0;
    while(iter.hasNext())
      total += ((Integer)(iter.next())).intValue();
    return total;
  }

  public int forVec(Vector vec)
  {
    int size = vec.size();
    int total = 0;
    for (int i=0; i<size; i++)
      total += ((Integer)(vec.get(i))).intValue();
    return total;
  }

  public static void main(String args[])
  {
    int val = Integer.parseInt(args[0]);
    Test t = new Test();
    Vector v = new Vector(100);
    for (int j=0; j<100;j++)
      v.add(new Integer(j));

    long start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.iterVec(v);
    long end = System.currentTimeMillis();
    System.out.println("use iter " + (end-start));
    long iter=end-start;

    start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.listIterVec(v);
    end = System.currentTimeMillis();
    System.out.println("use listiterator " + (end-start));
    long listiter=end-start;

    start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.enumVec(v);
    end = System.currentTimeMillis();
    System.out.println("use enum " + (end-start));
    long enum=end-start;

    start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.forVec(v);
    end = System.currentTimeMillis();
    System.out.println("use for loop " + (end-start));
    long forloop=end-start;
    long num=((iter-forloop)*100)/iter;
    System.out.println("for loop is " + num + " percent faster " +
                       "than iter");
    num=((listiter-forloop)*100)/listiter;
    System.out.println("for loop is " + num + " percent faster " +
                       "than listiter");
    num=((enum-forloop)*100)/enum;
    System.out.println("for loop is " + num + " percent faster " +
                       "than enum");
  }
}
