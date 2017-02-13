class ExcPerf
{
  public void method1(int size)                               
  {
    int[] ia = new int[size];
    try {
      for (int i=0; i<size; i++)
        ia[i] = i;
      //...
    }
    catch (Exception e){}
  }

  public void method2(int size)                               
  {
    int[] ia = new int[size];
    for (int i=0; i<size; i++)
    {
      try {                                                   
          ia[i] = i;
          //...
      }
      catch (Exception e){}
    }
  }

  public static void main(String args[])
  {
    int size = Integer.parseInt(args[0]);
    ExcPerf ep = new ExcPerf();
    long start = System.currentTimeMillis();
    ep.method1(size);
    long end = System.currentTimeMillis();
    System.out.println("normal processing took an average of " +
      (end-start) + " milliseconds");

    start = System.currentTimeMillis();
    ep.method2(size);
    end = System.currentTimeMillis();
    System.out.println("try/catch block processing took an " +
                  "average of " + (end-start) + " milliseconds");
  }
}
