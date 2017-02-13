class Golfball
{
  private StringBuffer brand;
  private StringBuffer make;
  private int compression;
  public Golfball (StringBuffer str, StringBuffer mk, int comp)
  {
    brand = str;
    make = mk;
    compression = comp;
  }

  public StringBuffer brand()
  {
    return brand;
  }

  public StringBuffer make()
  {
    return make;
  }
  //As before...
}