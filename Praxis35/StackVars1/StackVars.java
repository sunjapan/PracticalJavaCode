class StackVars
{
  private int instVar;
  private static int staticVar;

  //stack variable access
  void stackAccess(int val)
  {
    int j=0;
    for (int i=0; i<val; i++)
      j += 1;
  }

  //class instance variable access
  void instanceAccess(int val)
  {
    for (int i=0; i<val; i++)
      instVar += 1;
  }

  //class static variable access
  void staticAccess(int val)
  {
    for (int i=0; i<val; i++)
      staticVar += 1;
  }

  public static void main(String args[])
  {
    StackVars t = new StackVars();
    long start = System.currentTimeMillis();
    for (int i=0; i<100; i++)
      t.stackAccess(1000000);
    long end = System.currentTimeMillis();
    System.out.println("loop with stack vars " + (end-start));
    long num=end-start;
    start = System.currentTimeMillis();
    for (int i=0; i<100; i++)
      t.instanceAccess(1000000);
    end = System.currentTimeMillis();
    System.out.println("loop with instance vars " + (end-start));
    num=(end-start)/num;
    start = System.currentTimeMillis();
    for (int i=0; i<100; i++)
      t.staticAccess(1000000);
    end = System.currentTimeMillis();
    System.out.println("loop with static vars " + (end-start));
    System.out.println("stack is " + num + " times faster than " +
                       "instance");
  }
}
