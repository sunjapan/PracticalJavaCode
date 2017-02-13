class test
{
  static void foo(int N)
  {
    int x = 5;
    int[] a = new int[N];
    for (int i=0; i<N; i++)
      a[i] = a[i] + x;
  }
  static void bar(int N)
  {
    int x = 5;
    int[] a = new int[N];
    for (int i=0; i<N; i++)
      a[i] += x;
  }
  public static void main(String args[])
  {
    int val = Integer.parseInt(args[0]);
    long start = System.currentTimeMillis();
    foo(val);
    long end = System.currentTimeMillis();
    System.out.println("foo " + (end-start));
    long num = end-start;

    start = System.currentTimeMillis();
    bar(val);
    end = System.currentTimeMillis();
    System.out.println("bar1 " + (end-start));
    num=(num-(end-start))*100/num;
    System.out.println("bar is " + num+ " percent faster");
  }
}
