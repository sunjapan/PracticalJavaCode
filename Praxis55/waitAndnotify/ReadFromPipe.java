class ReadFromPipe extends Thread
{
  private Pipe pipe;
  //...
  public void run()
  {
    int data;
    while(true)
    {
      synchronized(pipe) {
        while((data = pipe.getData()) == 0)
        {
          try {
            pipe.wait();                                      //1
          }
          catch(InterruptedException e){}  //Exception is ignored
        }                                  //purposefully.
        //Process data
      }
    }
  }
}