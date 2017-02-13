class Foo
{
  public static void main(String args[])
  {
    Customers cust = new Customers("SomeDataBase");
    //Use our Customers object to prime fields in a GUI.
    //...
    //Customers object no longer needed.
    //...
    //The rest of the app...
  }
}