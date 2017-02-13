class Base
{
  public void foo()
  {}
  public final void bar()
  {}
}

class Derived extends Base
{
  public void foo()
  {
    //Overriding Base.foo()
  }
  public void bar()
  {
    //Attempting to override Base.bar()
  }
}