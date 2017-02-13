class ShareVector extends Vector
{
  ShareVector(int size)
  {
    super(size);
  }

  public Object clone()
  {
    ShareVector v = (ShareVector)super.clone();
    int size = size();                      //Create a new Vector.
    for (int i=0; i<size; i++)              //Replace each element
    {                                       //in the Vector with a
      User u = (User)(this.get(i));         //clone of that
      v.setElementAt((User)(u.clone()), i); //element.
    }
    return v;
  }
}