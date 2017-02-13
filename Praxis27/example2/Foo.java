class Foo
{
  private int numElements;
  private MyList myList;

  public void add(Object o) throws SomeException
  {
    //...
    if (myList.maxElements() == numElements)             //1
    {
      //Reallocate myList
      //Copy elements as necessary
      //Could throw exceptions
    }
    myList.addToList(o);  //Could throw exception
    numElements++;                                       //2
  }
}