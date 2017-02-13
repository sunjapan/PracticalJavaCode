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
    iWheel.setRadius(7.4);
  }
}