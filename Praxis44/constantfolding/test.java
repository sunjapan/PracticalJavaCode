//Constant folding
class test
{ 
  static int a = 30;
  static int b = 60;
  static final int a1 = 30;
  static final int b1 = 60;
  public void foo()
  {
    int c = a + b + 100;
  }
  public void bar()
  {
    int c = a1 + b1 + 100;
  }
}
