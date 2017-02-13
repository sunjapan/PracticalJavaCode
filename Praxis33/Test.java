class Test
{
  public final static int ArraySize = 10;
  public int[] addArrays1(int[] arr1, int[] arr2)
  {
    int[] result = new int[ArraySize];
    IllegalArgumentException exc = new IllegalArgumentException
                                   ("arrays are invalid");

    if (arr1 != null && arr2 != null &&
        arr1.length == ArraySize && arr2.length == ArraySize)
    {
      for (int i=0;i<ArraySize; i++)
        result[i]=arr1[i]+arr2[i];
    }
    else
      throw exc;
    return result;
  }
  public int[] addArrays2(int[] arr1, int[] arr2)
  {
    if (arr1 != null && arr2 != null &&
        arr1.length == ArraySize && arr2.length == ArraySize)
    {
      int[] result = new int[ArraySize];
      for (int i=0;i<ArraySize; i++)
        result[i]=arr1[i]+arr2[i];
      return result;
    }
    throw new IllegalArgumentException("arrays are invalid");
  }
  public static void main(String args[])
  {
    int val=Integer.parseInt(args[0]);
    Test t = new Test();
    int[] a1 = new int[ArraySize];
    int[] a2 = new int[ArraySize];
    for (int j=0; j<ArraySize; j++)
      a1[j]=a2[j]=j;

    long start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
    {
      try {
        t.addArrays1(a1,a2);
      }
      catch(IllegalArgumentException e){}
    }
    long end = System.currentTimeMillis();
    System.out.println("add inefficient " + (end-start));
    long num = end-start;

    start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
    {
      try {
        t.addArrays2(a1,a2);
      }
      catch(IllegalArgumentException e){}
    }
    end = System.currentTimeMillis();
    System.out.println("add efficient " + (end-start));
    num = num/(end-start);
    System.out.println("effecient is " + num + " times faster");
  }
}
