import java.net.*;
import java.io.*;
class Communication
{
  private ServerSocket ss;
  private FileInputStream fileIn;
  //...
  public synchronized void cleanup() throws IOException
  {
    if (ss != null)
    {
      ss.close();
      ss = null;
    }
    if (fileIn != null)
    {
      fileIn.close();
      fileIn = null;
    }
  }

  protected void finalize() throws Throwable
  {
    try {
      cleanup();
    }
    finally {
      super.finalize();
    }
  }
  //...
}
