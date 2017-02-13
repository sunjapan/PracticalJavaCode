class RealTimeClock
{
  private int clkID;
  private long clockTime;

  public int clockID()
  {
    return clkID;
  }
  public void setClockID(int id)
  {
    clkID = id;
  }

  public long time()
  {
    return clockTime;
  }
  public void setTime(long t)
  {
    clockTime = t;
  }
  //...
}