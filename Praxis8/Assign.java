import java.awt.Point;

class Assign
{
  public static void main(String args[])
  {
    int a = 1;
    int b = 2;
    Point x = new Point(0,0);
    Point y = new Point(1,1);                                 //1
    System.out.println("a is " + a);
    System.out.println("b is " + b);
    System.out.println("x is " + x);
    System.out.println("y is " + y);
    System.out.println("Performing assignment and " +
                       "setLocation...");
    a = b;
    a++;
    x = y;                                                    //2
    x.setLocation(5,5);                                       //3

    System.out.println("a is " + a);
    System.out.println("b is " + b);
    System.out.println("x is " + x);
    System.out.println("y is " + y);
  }
}