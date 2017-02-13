class Stack
{
  private int stackSize = 10;
  private int[] intArr = new int[stackSize];
  private int index;  //Next available slot in the stack.

  public void push(int val)
  {
    synchronized(intArr) {
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
  }

  public int pop()
  {
    int retval;
    synchronized(intArr) {
      if (index > 0)
      {
        retval = intArr[index-1];  //Retrieve the value, and
        index--;                   //decrement the stack.
        return retval;
      }
    }
    throw new EmptyStackException();
  }
  //...
}