import java.awt.Point;
class PassByValue
{
  public static void modifyPoint(Point pt, int j)
  {
    pt.setLocation(5,5);                                      //1
    j = 15;
    System.out.println("During modifyPoint " + "pt = " + pt +
                       " and j = " + j);
  }

  public static void main(String args[])
  {
    Point p = new Point(0,0);                                 //2
    int i = 10;
    System.out.println("Before modifyPoint " + "p = " + p +
                       " and i = " + i);
    modifyPoint(p, i);                                        //3
    System.out.println("After modifyPoint " + "p = " + p +
                       " and i = " + i);
  }
}