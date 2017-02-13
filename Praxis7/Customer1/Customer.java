class Customers
{
  private int[] custIdArray;

  public Customers(String db)
  {
    int num = queryDB(db);
    custIdArray = new int[num];
    for (int i=0; i<num; i++)
      custIdArray[i] = //Some value from a database
                       //representing a customer ID.
  }
  //...
}