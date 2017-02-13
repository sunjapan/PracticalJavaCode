import java.io.*;
import java.util.Vector;

class ReadFileExceptions extends Exception
{
  private Vector excVector;
  public ReadFileExceptions(Vector v)
  {
    excVector = v;
  }
  public Vector exceptionVector()
  {
    return excVector;
  }
  //...
}

class NotHidden
{
  public static void main(String args[])
  {
    NotHidden nh = new NotHidden();
    try {
      nh.readFile();
    }
    catch (ReadFileExceptions rfe) {
      //...
    }
  }

  public void readFile() throws ReadFileExceptions
  {
    BufferedReader br1 = null;
    BufferedReader br2 = null;
    FileReader fr = null;
    Vector excVec = new Vector(2);  //Vector to store exceptions

    try {
      fr = new FileReader("data1.fil");
      br1 = new BufferedReader(fr);
      int i = br1.read();
      //Other code...
      fr = new FileReader("data2.fil");
      br2 = new BufferedReader(fr);
      i = br2.read();
      //Other code...
    }
    catch (FileNotFoundException fnfe) {
      excVec.add(fnfe);  //Add exception to Vector
    }
    catch (IOException ioe){
      excVec.add(ioe);  //Add exception to Vector
    }
    finally {
      if (br1 != null)
      {
        try {
          br1.close();
        }
        catch (IOException e) {
          excVec.add(e);  //Add exception to Vector
        }
      }
      if (br2 != null)
      {
        try {
          br2.close();
        }
        catch (IOException e) {
          excVec.add(e);  //Add exception to Vector
        }
      }
      if (excVec.size() != 0)
        throw new ReadFileExceptions(excVec);//Pass all exceptions
    }                                        //to caller.
  }
}