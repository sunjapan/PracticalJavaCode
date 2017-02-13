class StackVars
{
  private int instVar = 0;
  private static int staticVar = 0;

  void stackAccess(int val)
  {
    int j=0;
    for (int i=0; i<val; i++)
      j += 1;
  }

  void instanceAccess(int val)
  {
    int j = instVar;
    for (int i=0; i<val; i++)
      j += 1;
    instVar = j;
  }

  void staticAccess(int val)
  {
    int j = staticVar;
    for (int i=0; i<val; i++)
      j += 1;
    staticVar = j;
  }

  public static void main(String args[])
  {
    StackVars t = new StackVars();
    long start = System.currentTimeMillis();
    for (int i=0; i<100; i++)
      t.stackAccess(1000000);
    long end = System.currentTimeMillis();
    System.out.println("loop with stack vars " + (end-start));

    start = System.currentTimeMillis();
    for (int i=0; i<100; i++)
      t.instanceAccess(1000000);
    end = System.currentTimeMillis();
    System.out.println("loop with instance vars " + (end-start));

    start = System.currentTimeMillis();
    for (int i=0; i<100; i++)
      t.staticAccess(1000000);
    end = System.currentTimeMillis();
    System.out.println("loop with static vars " + (end-start));
  }
}
