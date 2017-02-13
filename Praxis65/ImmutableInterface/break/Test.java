public class Test
{
  public ImmutableCircle createWheel(double r)
  {
    return new MutableCircle(r);
  }

  public static void main(String args[])
  {
    Test t = new Test();
    ImmutableCircle iWheel = t.createWheel(5.0);
    System.out.println("Radius of wheel is " +
                       iWheel.radius());
    ((MutableCircle)iWheel).setRadius(7.4);
    System.out.println("Radius of wheel is now " +
                       iWheel.radius());
  }
}