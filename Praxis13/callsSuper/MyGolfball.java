class MyGolfball extends Golfball
{
  public final static byte TwoPiece = 0;
  public final static byte ThreePiece = 1;
  private byte ballConstruction;

  public MyGolfball(String str, String mk,
                   int comp, byte construction)
  {
    super(str, mk, comp);
    ballConstruction = construction;
  }

  public byte construction()
  {
    return ballConstruction;
  }

  public boolean equals(Object obj)
  {
    if (this == obj)                                          //1
      return true;

    if (obj != null && getClass() == obj.getClass() &&        //2
        super.equals(obj))                                    //3
    {
      MyGolfball gb = (MyGolfball)obj;  //Classes equal, downcast.
      if (ballConstruction == gb.construction())  //Compare attrs.
        return true;
    }
    return false;
  }
}
