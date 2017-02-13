import java.util.Vector;

class Shape
{}

class Circle extends Shape
{
  public double radius()
  {
    return 5.7;
  }
  //...
}

class Triangle extends Shape
{
  public boolean isRightTriangle()
  {
    //Code to determine if triangle is right
    return true;
  }
  //...
}

class StoreShapes
{
  public static void main(String args[])
  {
    Vector shapeVector = new Vector(10);
    shapeVector.add(new Triangle());
    shapeVector.add(new Triangle());
    shapeVector.add(new Circle());
    //...
    //Assume many Triangles and Circles are added and removed
    //...
    int size = shapeVector.size();
    for (int i=0; i<size; i++)
    {
      Object o = shapeVector.get(i);
      if (o instanceof Triangle)
      {
        if (((Triangle)o).isRightTriangle())
        {
          //...
        }
      }
      else if (o instanceof Circle)
      {
        double rad = ((Circle)o).radius();
        //...
      }
    }
  }
}