class Test
{
  public static void main(String args[])
  {
    int a = 10;
    float b = 10.0f;
    System.out.println("a is " + a);
    System.out.println("b is " + b);
    System.out.println("a==b is " + (a==b));

    Integer ia = new Integer(10);
    Float fa = new Float(10.0f);
    System.out.println("ia is " + ia);
    System.out.println("fa is " + fa);
    System.out.println("ia.equals(fa) is " + (ia.equals(fa)));
    System.out.println("fa.equals(ia) is " + (fa.equals(ia)));
  }
}