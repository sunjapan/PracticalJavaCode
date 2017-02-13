class Warehouse
{
  public static void main(String args[])
  {
    MyGolfball gb1 = new MyGolfball("BrandX", "Professional",
                                    100, MyGolfball.TwoPiece);
    MyGolfball gb2 = new MyGolfball("BrandX", "Professional",
                                    100, MyGolfball.TwoPiece);
    //...
    if (gb1.equals(gb2))
      System.out.println("Ball 1 equals Ball 2");
    else
      System.out.println("Ball 1 does not equal Ball 2");
  }
}