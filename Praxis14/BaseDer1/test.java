class Base
{
  public boolean equals(Object obj)
  {
    if (obj instanceof Base){}
    //...
    return true;
  }
}

class Derived extends Base
{}

class test
{
  public static void main(String args[])
  {
    Base b = new Base();
    Derived d = new Derived();
  //if (d.equals(b))  //Potentially true if Base attributes are equal
  //if (b.equals(d))  //Potentially true if Base attributes are equal
  //...
}   }
