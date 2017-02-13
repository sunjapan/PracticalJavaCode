class Golfball
{
  private StringBuffer brand;
  private StringBuffer make;
  private int compression;

  //...
  static boolean compare(StringBuffer sb1, StringBuffer sb2)
  {
    if (sb1 == sb2)
      return true;

    if (sb1 != null && sb2 != null)
    {
      int len = sb1.length();
      if (len != sb2.length())  //If lengths are not equal,
        return false;           //strings can't be either.

      int index = 0;
      while(index != len)
      {
        if (sb1.charAt(index) != sb2.charAt(index))
          return false;
        else
          index++;
      }
      return true;
    }
    return false;
  }

  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;


    if (obj != null && getClass() == obj.getClass())
    {
      Golfball gb = (Golfball)obj;
      if (compare(brand, gb.brand()) &&
          compare(make, gb.make()) &&
          compression == gb.compression())
      {
        return true;
      }
    }
    return false;
  }
}