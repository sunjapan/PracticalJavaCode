final class DiskDriveInfo
{
  private int driveSize;
  private String volumeLabel;
  private User driveShare;

  DiskDriveInfo(int size, String volLabel, User share)
  {
    driveSize = size;
    volumeLabel = volLabel;
    driveShare = share;
  }
  public int size()
  {
    return driveSize;
  }
  public String label()
  {
    return volumeLabel;
  }
  public User share()
  {
    return driveShare;
  }
}