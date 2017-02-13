class Golfball
{
  //As before...
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
}