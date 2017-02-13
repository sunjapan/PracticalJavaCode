class Warehouse
{
  public static void main(String args[])
  {
    Golfball gb1 = new Golfball(
                   new StringBuffer("BrandX"),
                   new StringBuffer("Professional"), 100);
    Golfball gb2 = new Golfball(
                   new StringBuffer("BrandX"),
                   new StringBuffer("Professional"), 100);
    //...
    if (gb1.equals(gb2))
      System.out.println("Ball 1 equals Ball 2");
    else
      System.out.println("Ball 1 does not equal Ball2");
  }
}
