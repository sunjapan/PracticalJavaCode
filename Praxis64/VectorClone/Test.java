import java.util.*;
class Test
{
  private static final int sizeInMeg = 200;
  public static void main(String args[])
  {
    User share1 = new User("Duke", 10);
    User share2 = new User("Duke2", 11);
    Vector shareVec = new Vector(2);
    shareVec.add(share1);  //Store 2 shared users in the vector.
    shareVec.add(share2);
    DiskDriveInfo dd = new DiskDriveInfo(sizeInMeg, "myDrive",
                                         shareVec);           //1



    Vector share = dd.share();
    System.out.println("Users with shared access are " +
                  ((User)(share.get(0))).userName() + ", " +
                  ((User)(share.get(1))).userName());

    share1.setUserName("Fred");
    System.out.println("Users with shared access are " +
                  ((User)(share.get(0))).userName() + ", " +
                  ((User)(share.get(1))).userName());
  }
}