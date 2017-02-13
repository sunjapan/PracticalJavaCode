class MyStringBuffer
{
  private StringBuffer stringbuf;

  public MyStringBuffer(String str)
  {
    stringbuf = new StringBuffer(str);
  }

  public int length()
  {
    return stringbuf.length();
  }

  public synchronized char charAt(int index)
  {
    return (stringbuf.charAt(index));
  }
  //Create passthrough methods for the rest of the
  //StringBuffer methods as needed.

  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;

    if (obj != null && getClass() == obj.getClass())
    {
      MyStringBuffer sb = (MyStringBuffer)obj; //Classes equal,
      int len = length();                      //downcast.
      if (len != sb.length())  //If lengths are not equal, strings
        return false;          //can't be either.

      int index = 0;
      while(index != len)  //Compare the strings.
      {
        if (charAt(index) != sb.charAt(index))
          return false;
        else
          index++;
      }
      return true;
    }
    return false;
  }
}