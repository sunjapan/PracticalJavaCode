class Test
{
  private int[] ia1;
  private int[] ia2;
  private double[] da1;
  private double[] da2;
  private byte[] lock1 = new byte[0];
  private byte[] lock2 = new byte[0];

  public void method1()
  {
    synchronized(lock1) {
      //Access ia1 and ia2
    }
  }
  public void method2()
  {
    synchronized(lock1) {
      //Access ia1 and ia2
    }
  }
  public void method3()
  {
    synchronized(lock2) {
      //Access da1 and da2
    }
  }
  public void method4()
  {
    synchronized(lock2) {
      //Access da1 and da2
    }
  }
  //...
}