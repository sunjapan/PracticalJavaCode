class MutableCircle
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
}

final class ImmutableCircle
{
  private MutableCircle mCircle;
  public ImmutableCircle(double r)
  {
    mCircle = new MutableCircle(r);
  }

  public double radius()
  {
    return mCircle.radius();
  }
}