class test
{
  public static void foo(int val)
  {
    int a = 10;
    int b = 20;
    int[] arr = new int[val];
    for (int j=0; j<val;j++) {
      for (int i=0; i<val; i++)
        arr[i] = a + b;
    }
  }
  public static void bar(int val)
  {
    int a = 10;
    int b = 20;
    int c = a + b;
    int[] arr = new int[val];
    for (int j=0; j<val;j++) {
      for (int i=0; i<val; i++)
        arr[i] = c;
    }
  }
  public static void main(String args[])
  {
    int val = Integer.parseInt(args[0]);
    System.gc();
    long start = System.currentTimeMillis();
    foo(val);
    long end = System.currentTimeMillis();
    System.out.println("foo is " + (end-start));
    long num =end-start;

    System.gc();
    start = System.currentTimeMillis();
    bar(val);
    end = System.currentTimeMillis();
    System.out.println("bar is " + (end-start));
    num=((num-(end-start))*100)/num;
    System.out.println("bar is " + num + " percent faster");
  }
}
