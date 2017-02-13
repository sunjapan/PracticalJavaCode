class Test
{
  public static void main(String args[])
  {
    System.gc();
    long start = System.currentTimeMillis();
    for (int i=0; i<100000; i++)
    {
      Light lgt = new Light(1);
    }
    long end = System.currentTimeMillis();
    long val = end-start;
    System.out.println("Light is " + (end-start));

    System.gc();
    start = System.currentTimeMillis();
    for (int i=0; i<1; i++)
    {
      Heavy hvy = new Heavy(4, true);
    }
    end = System.currentTimeMillis();
    System.out.println("heavy is " + (end-start));
    val = (end-start)/val;
    System.out.println("heavy is " + val + " times more expensive");
    System.exit(0);
  }
}
