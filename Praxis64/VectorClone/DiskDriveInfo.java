final class DiskDriveInfo
{
  //As before...
  private Vector driveShare;

  DiskDriveInfo(int size, String volLabel, Vector share)
  {
    //As before...
    driveShare = (Vector)share.clone();
  }
  //As before...
  public Vector share()
  {
    return (Vector)driveShare.clone();
  }
}