class test
{
  public static void foo(int val)
  {
    String str = new String("Practical ");
    for (int i=0; i<val; i++)
      str += "Java";
  }
  public static void bar(int val)
  {
    StringBuffer str = new StringBuffer("Practical ");
    for (int i=0; i<val; i++)
      str.append("Java");
  }
  public static void main(String args[])
  {
    int val = Integer.parseInt(args[0]);
    long start = System.currentTimeMillis();
    foo(val);
    long end = System.currentTimeMillis();
    System.out.println("foo is " + (end-start));
    long num = end-start;

    start = System.currentTimeMillis();
    bar(val);
    end = System.currentTimeMillis();
    System.out.println("bar is " + (end-start));
    num = num/(end-start);
    System.out.println("concat is " + num + " times faster");
  }
}
