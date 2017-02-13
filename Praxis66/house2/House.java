class House implements Cloneable
{
  //As before...
  public Object clone()
  {
    try {
      return super.clone();
    }
    catch (CloneNotSupportedException e) {
      throw new InternalError();
    }
  }
}