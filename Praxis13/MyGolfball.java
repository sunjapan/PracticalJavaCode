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
    if (this == obj)
      return true;

    if (obj != null && getClass() == obj.getClass())
    {
      MyGolfball gb = (MyGolfball)obj;  //Class equal, downcast.
      if (ballConstruction == gb.construction())
        return true;
    }
    return false;
  }
}