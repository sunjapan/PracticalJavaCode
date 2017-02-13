class Test implements Runnable
{
  public int[] intArray = new int[10];

  public synchronized void addToArray(int[] ar)
  {
    int len = intArray.length;
    if (len == ar.length)
    {
      for (int i=0; i<len; i++)
      {
        System.out.println(intArray[i]);
        intArray[i] += ar[i];
      }
    }
  }

  public synchronized void subtractFromArray(int[] ar)
  {
    int len = intArray.length;
    if (len == ar.length)
    {
      for (int i=0; i<len; i++)
        intArray[i] -= ar[i];
    }
  }

  public void run()
  {
    int[] a = new int[10];
    addToArray(a);
  }
  //...
}
class Foo{
  public static void main(String args[])
  {
    Test tst = new Test();
    Thread t = new Thread(tst);
    t.start();
    tst.intArray = null;
  }
}
