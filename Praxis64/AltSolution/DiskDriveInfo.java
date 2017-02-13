final class DiskDriveInfo
{
  private int driveSize;
  private String volumeLabel;
  private Vector driveShare;

  DiskDriveInfo(int size, String volLabel, Vector share)
  {
    driveSize = size;
    volumeLabel = volLabel;
    driveShare = cloneVector(share);
  }
  public int size()
  {
    return driveSize;
  }
  public String label()
  {
    return volumeLabel;
  }
  public Vector share()
  {
    return cloneVector(driveShare);
  }
  private Vector cloneVector(Vector v)
  {
    int size = v.size();
    Vector newVector = new Vector(size);      //Create new Vector.
    for (int i=0; i<size; i++)                //For each element
      newVector.add(((User)v.get(i)).clone());//in the old Vector,
    return newVector;                         //add its clone to
  }                                           //the new Vector.
}