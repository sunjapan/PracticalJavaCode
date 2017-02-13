class Exception1 extends Exception
{}
class Exception2 extends Exception1
{}
class Exception3 extends Exception2
{}
class Lazy
{
  public void foo(int i) throws Exception1
  {
    if (i==1)
      throw new Exception1();
    if (i==2)
      throw new Exception2();
    if (i==3)
      throw new Exception3();
  }
}