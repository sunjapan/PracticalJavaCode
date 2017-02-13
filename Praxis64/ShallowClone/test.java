User share1 = new User("Duke", 10);
DiskDriveInfo dd = new DiskDriveInfo(sizeInMeg, "myDrive",
                                     share1);
User share = dd.share();
System.out.println("User with shared access is " +
                   share.userName());

share1.setUserName("Fred");                                   //1
System.out.println("User with shared access is " +
                   share.userName());