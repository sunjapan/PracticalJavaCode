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
    if (obj != null && getClass() == obj.getClass() &&
        super.equals(obj))
    //...
  }
}

Base b = new Base();
Derived d = new Derived();
if (d.equals(b))  //Always false
if (b.equals(d))  //Potentially true