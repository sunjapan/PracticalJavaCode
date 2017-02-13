class ReadFromPipe extends Thread
{
  private Pipe pipe;

  //...
  public void run()
  {
    int data;
    while(true)
    {
      while((data = pipe.getData()) == 0)
      {
        //No data, so sleep for a while and try again.
        try {
          sleep(200);
        }
        catch(InterruptedException e){}  //Exception is ignored
      }                                  //purposefully.
      synchronized(pipe) {
        //Process data
      }
    }
  }
}