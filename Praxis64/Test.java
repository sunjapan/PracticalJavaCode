class Test
{
  private static final int sizeInMeg = 200;
  public static void main(String args[])
  {
    User share1 = new User("Duke", 10);                       //1
    DiskDriveInfo dd = new DiskDriveInfo(sizeInMeg, "myDrive",
                                         share1);             //2
    User share = dd.share();
    System.out.println("User with shared access is " +
                       share.userName());

    share1.setUserName("Fred");                               //3
    System.out.println("User with shared access is " +
                       share.userName());
  }
}