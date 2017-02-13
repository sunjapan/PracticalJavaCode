class Golfball
{
  private MyStringBuffer brand;
  private MyStringBuffer make;
  private int compression;

  public Golfball (MyStringBuffer str,
                   MyStringBuffer mk, int comp)
  {
    brand = str;
    make = mk;
    compression = comp;
  }

  public MyStringBuffer brand()
  {
    return brand;
  }

  public MyStringBuffer make()
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

    if (obj != null && getClass() == obj.getClass())
    {
      Golfball gb = (Golfball)obj;  //Classes are equal, downcast.
      if (brand.equals(gb.brand()) &&  //Compare attributes.
          make.equals(gb.make()) &&
          compression == gb.compression())
      {
        return true;
      }
    }
    return false;
  }
  //...
}