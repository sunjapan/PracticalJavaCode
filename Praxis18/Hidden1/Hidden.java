class Hidden
{
  public static void main (String args[])
  {
    Hidden h = new Hidden();
    try {
      h.foo();
    }
    catch (Exception e) {
      System.out.println("In main, caught exception: " +
                         e.getMessage());
    }
  }
  public void foo() throws Exception
  {
    try {
      throw new Exception("First Exception");                 //1
    }
    catch (Exception e) {
      throw new Exception("Second Exception");                //2
    }
    finally {
      throw new Exception("Third Exception");                 //3
    }
  }
}