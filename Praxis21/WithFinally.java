import java.net.*;
import java.io.*;

class WithFinally
{
  public void foo2() throws IOException
  {
    //Create a socket on any free port
    ServerSocket ss = new ServerSocket(0);
    try {
      Socket socket = ss.accept();
      //Other code here...
    }
    finally {
      ss.close();
    }
  }
}