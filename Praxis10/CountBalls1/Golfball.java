class Golfball
{
  private String brand;
  private String make;
  private int compression;

  public Golfball (String str, String mk, int comp)
  {
    brand = str;
    make = mk;
    compression = comp;
  }

  public String brand()
  {
    return brand;
  }

  public String make()
  {
    return make;
  }

  public int compression()
  {
    return compression;
  }
}