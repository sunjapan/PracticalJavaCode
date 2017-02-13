class Test extends Thread
{
  private volatile boolean stop;

  public void stopThread()
  {
    stop = true;
  }

  public void run()
  {
    while(!stop)
    {
      //Do work...
    }
    //Clean up...
  }
}