class Foo
{
  final public int bar1()
  {
    return 1;
  }
  public int bar2()
  {
    return bar4();             //Call to private bar4 not inlined.
  }
  static public int bar3()
  {
    return 3;
  }
  private int bar4()
  {
    return 4;
  }
}

class Test
{
  public static void main(String args[])
  {
    Foo f = new Foo();
    int a = 5 + f.bar1();      //Call to final bar1 not inlined.
    int b = 5 + f.bar2();
    int c = 5 + Foo.bar3();    //Call to static bar3 not inlined.
  }
}