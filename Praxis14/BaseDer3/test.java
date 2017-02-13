class Base
{
  public boolean equals(Object obj)
  {
    if (obj instanceof Base)                                 //1
      //...
  }
}

class Derived extends Base
{
  public boolean equals(Object obj)
  {
    if (super.equals(obj))  //Superclass performs instanceof check
    //...
  }
}