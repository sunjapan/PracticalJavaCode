class Robot extends Thread
{
  private static byte[] commands;
  private RobotController controller;
  public Robot(RobotController c)
  {
    controller = c;
  }
  public static void storeCommands(byte[] b)
  {
    commands = b;
  }
  public void processCommand(byte b)
  {
    //Move the robot based on the command.
  }

  public void run()
  {
    while(true)
    {
      synchronized(controller) {                              //1
        if (commands == null)                                 //2
        {
          try {
            controller.wait();                                //3
          }
          catch(InterruptedException e){}  //Exception is ignored
        }                                  //purposefully.
        //Now we have commands for the robot.
        int size = commands.length;
        for (int i=0; i<size; i++)
          processCommand(commands[i]);     //Move the robot.
        commands = null;
      }
    }
  }
}

class RobotController extends Thread
{
  private Robot robot1;
  private Robot robot2;
  public static void main(String args[])
  {
    RobotController rc = new RobotController();
    rc.start();
  }

  public void run()
  {
    robot1 = new Robot(this);
    robot1.start();
    robot2 = new Robot(this);
    robot2.start();
  }

  public void loadCommands(byte[] b)
  {
    synchronized(this) {                                      //4
      Robot.storeCommands(b);  //Give the commands to the Robot
      notifyAll();             //class. Notify all threads.

    }
  }
}