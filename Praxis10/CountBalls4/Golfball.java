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
      if (brand.toString().equals(gb.brand().toString()) &&
          make.toString().equals(gb.make().toString()) &&
          compression == gb.compression())
      {
        return true;
      }
    }
    return false;
  }
}