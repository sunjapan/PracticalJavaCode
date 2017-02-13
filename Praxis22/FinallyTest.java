class FinallyTest
{
  public int method1()
  {
    try {
      return 2;
    }
    catch(Exception e) {return 3;}
  }

  public int method2()
  {
    try {
      return 3;                                               //1
    }
    finally {                                                 //2
      return 4;
    }
  }

  public static void main(String args[])
  {
    FinallyTest ft = new FinallyTest();
    System.out.println("method1 returns " + ft.method1());    //3
    System.out.println("method2 returns " + ft.method2());    //4
  }
}