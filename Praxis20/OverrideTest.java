import java.io.*;

class Base
{
  public void foo() throws FileNotFoundException
  {
    //...
    throw new FileNotFoundException();
  }
}

class OverrideTest extends Base
{
  public void foo() throws IOException
  {
    throw new IOException();
  }
}