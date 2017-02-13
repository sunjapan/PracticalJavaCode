class test
{
  static void foo()
  {
    int[] ia = new int[4];
    for (int i=0; i<4; i++)
      ia[i] = 10;
  }
  static void bar()
  {
    int[] ia = new int[4];
    ia[0] = 10;
    ia[1] = 10;
    ia[2] = 10;
    ia[3] = 10;
  }
  public static void main(String args[])
  {
    int val=Integer.parseInt(args[0]);
    long start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      foo();
    long end = System.currentTimeMillis();
    System.out.println("foo " + (end-start));
    long num = end-start;

    start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      bar();
    end = System.currentTimeMillis();
    System.out.println("bar " + (end-start));
    num=(num-(end-start))*100/num;
    System.out.println("bar is " + num + " percent faster");
  }
}
