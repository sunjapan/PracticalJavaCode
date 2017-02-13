class test
{
  public static void foo(int val)
  {
    int a = 1; int b = 2; int c = 3;
    int d = 4; int e = 5; int f = 6;
    int x = 0;
    for (int i=0; i<val; i++)
      x = (f*a)+(f*b)+(f*c)+(f*d)+(f*e);
  }
  public static void bar(int val)
  {
    int a = 1; int b = 2; int c = 3;
    int d = 4; int e = 5; int f = 6;
    int x = 0;
    for (int i=0; i<val; i++)
      x = f*(a+b+c+d+e);
  }
  public static void main(String args[])
  {
    int val=Integer.parseInt(args[0]);
    System.gc();
    long start = System.currentTimeMillis();
    foo(+val);
    long end = System.currentTimeMillis();
    System.out.println("foo is " + (end-start));
    long num = end-start;

    System.gc();
    start = System.currentTimeMillis();
    bar(val);
    end = System.currentTimeMillis();
    System.out.println("bar is " + (end-start));
    num=((num-(end-start))*100)/num;
    System.out.println("bar is " + num + " percent faster");
  }
}
