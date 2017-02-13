class Shape
{}
class Circle extends Shape
{}
class Triangle extends Shape
{}
class Polynomial
{}

class Shapes
{
  public static void main(String args[])
  {
    Shape shape1 = new Circle();
    Object shape2 = new Triangle();

    Polynomial poly = (Polynomial)shape1;  //Compile error.
    Triangle tri = (Triangle)shape1;       //Runtime error.
    Triangle tri2 = (Triangle)shape2;      //OK
  }
}