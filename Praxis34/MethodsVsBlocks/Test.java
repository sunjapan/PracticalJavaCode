class Stack
{
  private int[] intArr;
  private int index;

  Stack(int v)
  {
    intArr = new int[v];
  }

  public synchronized int top1()
  {
    return intArr[0];
  }

  public int top2()
  {
    synchronized (this) {
      return intArr[0];
    }
  }

  public synchronized void push(int val)
  {
    intArr[index] = val;
    index++;
  }

  public synchronized int pop()
  {
    index--;
    return intArr[index];
  }

  public synchronized boolean contains(int val)
  {
    int size = intArr.length;
    boolean found = false;
    for (int i=0;i<size;i++)
    {
      if (intArr[i] == val)
      {
        found = true;
        break;
      }
    }
    return found;
  }
}

class Test extends Thread
{
  private Stack stack;

  Test(int v)
  {
    stack = new Stack(v);
  }

  public static void main(String args[])
  {
    int val=Integer.parseInt(args[0]);
    Test t = new Test(val);

    long start = System.currentTimeMillis();
    for (int i=0;i<val;i++)
      t.stack.top1();
    long end = System.currentTimeMillis();
    System.out.println("top1 " + (end-start));

    start = System.currentTimeMillis();
    for (int i=0;i<val;i++)
      t.stack.top2();
    end = System.currentTimeMillis();
    System.out.println("top2 " + (end-start));
  }
}
