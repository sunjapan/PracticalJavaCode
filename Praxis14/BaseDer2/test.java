class Base
{
  private int attributeOfBase;
  public boolean equals(Object obj)
  {
    if (obj instanceof Base)
      //...
  }
}

class Derived extends Base
{
  private int attributeOfDerived;
  public boolean equals(Object obj)
  {
    if (obj instanceof Derived)
    //...
  }
}