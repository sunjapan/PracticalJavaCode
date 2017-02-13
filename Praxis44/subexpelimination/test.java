//Common subexpression elimination
import java.awt.Point;

class SomeObject
{
  public int foo(int i)
  {
    return 1;
  }
  //...
}
class test
{
  static void foo()
  {
    SomeObject[] someObj = new SomeObject[5];
    int i = 2;
    int j = 2;

    someObj[i+j] = new SomeObject();
    for (int k=0; k <1000000; k++)
    {
      someObj[i+j].foo(k);
      someObj[i+j].foo(k+1);
      someObj[i+j].foo(k+2);
      someObj[i+j].foo(k+3);
      someObj[i+j].foo(k+4);
    }
  }
  static void bar()
  {
    SomeObject[] someObj = new SomeObject[5];
    int i = 2;
    int j = 2;

    someObj[i+j] = new SomeObject();
    SomeObject tempObj = someObj[i+j];
    for (int k=0; k <1000000; k++)
    {
      tempObj.foo(k);
      tempObj.foo(k+1);
      tempObj.foo(k+2);
      tempObj.foo(k+3);
      tempObj.foo(k+4);
    }
  }
  public static void main(String args[])
  {
    System.gc();
    long start = System.currentTimeMillis();
    foo();
    long end = System.currentTimeMillis();
    System.out.println("orig " + (end-start));

    System.gc();
    start = System.currentTimeMillis();
    bar();
    end = System.currentTimeMillis();
    System.out.println("myopt " + (end-start));
  }
}
