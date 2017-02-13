interface ImmutableCircle
{
  public double radius();
}

class MutableCircle implements ImmutableCircle
{
  private double radius;

  public MutableCircle(double r)
  {
    radius = r;
  }

  public void setRadius(double r)
  {
    radius = r;
  }

  public double radius()
  {
    return radius;
  }
  //...
}