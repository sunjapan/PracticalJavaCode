import java.io.*;

class Foo
{
  public Foo (String fileName) throws FileNotFoundException,
                                      IOException
  {
    FileReader fr = new FileReader(fileName);
    BufferedReader br = new BufferedReader(fr);
    String str = br.readLine();
    //...
  }
  public void scanfile()
  {}
}
class Test
{
  public static void main(String args[])
  {
    Foo somefoo = null;
    try {
      somefoo = new Foo("temp.fil");
    }
    catch (FileNotFoundException fnfe) { //Catch constructor
      //...                              //failure
    }
    catch (IOException ioe) {  //Catch constructor failure
      //...
    }
    //Use somefoo
    somefoo.scanfile();
  }
}