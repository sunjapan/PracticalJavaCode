import java.util.*;

class Test
{
  public void iterateArray(int[] ar)
  {
    int size = ar.length;
    int j;
    for (int i=0; i<size; i++)
      j = ar[i];
  }
  public void iterateVector(Vector vec)
  {
    int size = vec.size();
    Object j;
    for (int i=0; i<size; i++)
      j = vec.get(i);
  }
  public void iterateArrayList(ArrayList al)
  {
    int size = al.size();
    Object j;
    for (int i=0; i<size; i++)
      j = al.get(i);
  }

  public static void main(String args[])
  {
    long time1,time2, time3;
    int val = Integer.parseInt(args[0]);
    Test t = new Test();
    int[] arr = new int[100];
    for (int j=0; j<arr.length; j++) {
      arr[j]=j;
    }
    long start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.iterateArray(arr);
    long end = System.currentTimeMillis();
    System.out.println("array " + (end-start));
    time1=end-start;

    Vector vec = new Vector(100);
    for (int i=0; i<100; i++)
    {
      vec.add(new Object());
    }
    start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.iterateVector(vec);
    end = System.currentTimeMillis();
    System.out.println("vector " + (end-start));
    time2=end-start;
    System.out.println("array is " + (time2/time1) +
                       " times as fast as Vector");

    ArrayList al = new ArrayList(100);
    for (int i=0; i<100; i++)
    {
      al.add(new Object());
    }
    start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.iterateArrayList(al);
    end = System.currentTimeMillis();
    System.out.println("arrayList " + (end-start));
    time3=end-start;
    System.out.println("array is " + (time3/time1) +
                       " times as fast as arrayList");
  }
}
