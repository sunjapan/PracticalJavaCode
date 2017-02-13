class test
{
  public static void foo()
  {
    int j = 5;
    int[] a = new int[1000000];
    for (int i=0; i<1000000; i++)
    {
      a[i] = j;
      if (j == 5)
        a[i] = 25;
      else
        a[i] = 10;
    }
  }
  public static void bar()
  {
    int[] a = new int[1000000];
    for (int i=0; i<1000000; i++)
      a[i] = 25;
  }
  public static void main(String args[])
  {
    int val = Integer.parseInt(args[0]);
    System.gc();
    long start = System.currentTimeMillis();
    for (int i=0;i<val;i++)
      foo();
    long end = System.currentTimeMillis();
    System.out.println("foo is " + (end-start));
    long num = end-start;

    System.gc();
    start = System.currentTimeMillis();
    for (int i=0;i<val;i++)
      bar();
    end = System.currentTimeMillis();
    System.out.println("bar is " + (end-start));
    num=(num-(end-start))*100/num;
    System.out.println("bar is " + num + " percent faster");
  }
}
