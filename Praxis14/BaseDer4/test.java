class Base
{
  public boolean equals(Object obj)
  {
    if (obj instanceof Base)
      //...
  }
}

class Derived extends Base
{
  public boolean equals(Object obj)
  {
    if (obj instanceof Derived)
    //...
  }
}

Base b = new Base();
Derived d = new Derived();