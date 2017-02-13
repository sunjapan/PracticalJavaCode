public int sumArrays(int[] a1, int[] a2)
{
  int value = 0;
  int size = a1.length;
  if (size == a2.length) {
    synchronized(a1) {                                        //1
      synchronized(a2) {                                      //2
        for (int i=0; i<size; i++)
          value += a1[i] + a2[i];
      }
    }
  }
  return value;
}