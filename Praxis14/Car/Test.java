class Car 
{
  private String make;
  private int year;
  public void drive() 
  {
    //code to drive the car
  }
  public boolean equals(Object obj) 
  {
    //Compare make and year for equality
    return true;
  }
//...
}
class MyCar extends Car 
{
  public void drive() 
  {
    //code to drive the car differently than base class
  }
  //...
}
