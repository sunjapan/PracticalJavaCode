import java.io.*;
class Hidden
{
  public static void main(String args[])
  {
    Hidden h = new Hidden();
    try {
      h.readFile();
    }
    catch (FileNotFoundException fne) {
      //...
    }
    catch (IOException ioe) {
      //...
    }
  }
  public void readFile() throws FileNotFoundException,
                                IOException
  {
    BufferedReader br1 = null;
    BufferedReader br2 = null;
    FileReader fr = null;

    try {
      fr = new FileReader("data1.fil");                       //1
      br1 = new BufferedReader(fr);
      int i = br1.read();                                     //2
      //Other code...
      fr = new FileReader("data2.fil");                       //3
      br2 = new BufferedReader(fr);
      i = br2.read();                                         //4
      //Other code...
    }
    finally {
      if (br1 != null)
        br1.close();                                          //5
      if (br2 != null)
        br2.close();                                          //6
    }
  }
}