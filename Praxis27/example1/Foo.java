class SomeException extends Exception
{}
class MyList
{}
class Foo
{
  private int numElements;
  private MyList myList;

  public void add(Object o) throws SomeException
  {
    //...
    numElements++;                                       //1
    if (myList.maxElements() < numElements)
    {
      //Reallocate myList
      //Copy elements as necessary
      //Could throw exceptions
    }
    myList.addToList(o);  //Could throw exception        //2
  }
}