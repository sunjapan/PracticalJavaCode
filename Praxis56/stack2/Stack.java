class Stack
{
  //As before...
  public synchronized void push(int val)
  {
    //Reallocate integer array(our stack) if it is full.
    if (index == intArr.length)
    {
      stackSize *= 2;
      int[] newintArr = new int[stackSize];
      System.arraycopy(intArr, 0 , newintArr, 0, intArr.length);
      intArr = newintArr;
    }
    intArr[index] = val;
    index++;
  }

  public synchronized int pop()
  {
    int retval;
    if (index > 0)
    {
      retval = intArr[index-1];
      index--;
      return retval;
    }
    throw new EmptyStackException();
  }
}