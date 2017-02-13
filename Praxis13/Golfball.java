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

  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;

    if ((obj != null) && (getClass() == obj.getClass()))
    {
      Golfball gb = (Golfball)obj;
      if ((brand.equals(gb.brand())) &&
          (make.equals(gb.make())) &&
          (compression == gb.compression()))
      {
        return true;
      }
    }
    return false;
  }
  //...
}
