final class DiskDriveInfo
{
  //As before...
  DiskDriveInfo(int size, String volLabel, User share)
  {
    driveSize = size;
    volumeLabel = volLabel;
    driveShare = (User)share.clone();
  }
  public User share()
  {
    return (User)driveShare.clone();
  }
}