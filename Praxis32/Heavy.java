import java.awt.*;
class Base
{
  private int val;
  public Base(int a)
  {
    val = a;
  }
}
class Der1 extends Base
{
  public Der1(int a)
  {
    super(a);
  }
}
class Der2 extends Der1
{
  private boolean state;
  private boolean hasData = true;
  public Der2(int a, boolean b)
  {
    super(a);
    state = b;
  }
}
class Heavy extends Der2
{
  private Point pt;
  private TextField tf;
  public Heavy(int a, boolean b)
  {
    super(a, b);
    pt = new Point(0,0);
    tf = new TextField("text");
  }
  //...
}