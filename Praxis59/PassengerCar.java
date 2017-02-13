class PassengerCar implements Vehicle, Asset
{
  public void startEngine() {
    //Code to start engine...
  }
  public void stopEngine() {
    //Code to stop engine...
  }
  public void accelerate()  {
    //Code to accelerate...
  }
  public void decelerate() {
    //Code to decelerate...
  }
  public int initialCost() {
    //Return initialCost...
  }
  public int currentValue() {
    //Calculate and return current value...
  }
  public double rateOfGrowth() {
    //Calculate and return the growth rate of the car...
    //For most cars, this will be negative.
  }
  public void loadPeopleInCar() {
    //Code to load people in car...
  }
  public int adultSeating() {
    return 4;
  }
  public int childSeating() {
    return 3;
  }
}