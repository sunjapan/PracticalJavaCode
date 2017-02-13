class House implements Cloneable
{
  private int numberOfRooms;
  private int squareFeet;
  //...
  public Object clone()
  {
    return new House();
  }
}