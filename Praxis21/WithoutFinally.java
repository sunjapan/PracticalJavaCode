import java.net.*;
import java.io.*;

class WithoutFinally
{
  public void foo() throws IOException
  {
    //Create a socket on any free port
    ServerSocket ss = new ServerSocket(0);
    try {
      Socket socket = ss.accept();
      //Other code here...
    }
    catch (IOException e) {
      ss.close();                                             //1
      throw e;
    }
    //...
    ss.close();                                               //2
  }
}