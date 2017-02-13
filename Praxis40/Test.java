 class Test
 {
   public void copyArray1(int[] src, int[] dest)
   {
     int size = src.length;
     for (int i=0; i<size; i++)
       dest[i] = src[i];
   }
   public void copyArray2(int[] src, int[] dest)
   {
     int size = src.length;
     System.arraycopy(src, 0, dest, 0, size);
   }

   public static void main(String args[])
   {
     int val = Integer.parseInt(args[0]);
     Test t = new Test();
     int[] src = new int[100];
     int[] dest = new int[100];
     for (int j=0; j<src.length; j++)
       src[j]=j;
     long start = System.currentTimeMillis();
     for (int i=0; i<val; i++)
       t.copyArray1(src, dest);
     long end = System.currentTimeMillis();
     System.out.println("copy with loop " + (end-start));

     start = System.currentTimeMillis();
     for (int i=0; i<val; i++)
       t.copyArray2(src, dest);
     end = System.currentTimeMillis();
     System.out.println("copy with System.arraycopy() " +
                        (end-start));

   }
 }

