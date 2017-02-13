class User implements Cloneable
{
  //As before...
  public Object clone()
  {
    try {
      return super.clone();
    }
    catch (CloneNotSupportedException e) {
      //This should not happen, since this class is Cloneable.
      throw new InternalError();
    }
  }
}