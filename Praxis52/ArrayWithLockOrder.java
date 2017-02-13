class ArrayWithLockOrder
{
  private static long num_locks = 0;
  private long lock_order;
  private int[] arr;

  public ArrayWithLockOrder(int[] a)
  {
    arr = a;
    synchronized(ArrayWithLockOrder.class) {
      num_locks++;             //Increment the number of locks.
      lock_order = num_locks;  //Set the unique lock_order for
    }                          //this object instance.
  }
  public long lockOrder()
  {
    return lock_order;
  }
  public int[] array()
  {
    return arr;
  }
}



class SomeClass implements Runnable
{
  //...
  public int sumArrays(ArrayWithLockOrder a1,
                       ArrayWithLockOrder a2)
  {
    int value = 0;
    ArrayWithLockOrder first = a1;  //Keep a local copy of array
    ArrayWithLockOrder last = a2;   //references.
    int size = a1.array().length;
    if (size == a2.array().length)
    {
      if (a1.lockOrder() > a2.lockOrder()) //Determine and set the
      {                                    //lock order of the
        first = a2;                        //objects.
        last = a1;
      }
      synchronized(first) {  //Lock the objects in correct order.
        synchronized(last) {
          for (int i=0; i<size; i++)
            value += (a1.array())[i] + (a2.array())[i];
        }
      }
    }
    return value;
  }
  public void run()
  {
    //...
  }
}