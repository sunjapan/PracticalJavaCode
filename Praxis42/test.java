class Employee
{
  private String EmpName;
  private String EmpTitle;
  private int EmpNumber;
  public Employee()
  {}
  public Employee(String name, String title, int number)
  {
    EmpName = name;
    EmpTitle = title;
    EmpNumber = number;
  }
  public int salary()
  {   
    int salary = 100;
    //query database based on Employee object to get salary.
    //salary = querydb(this);
    return salary;
  }
  public void setName(String name)
  {
    EmpName = name;
  }
  public void setTitle(String title)
  {
    EmpTitle = title;
  }
  public void setNumber(int number)
  {
    EmpNumber = number;
  }
  //...
}
class test
{
  public int computePayroll1(String[] name, String[] title, 
                             int[] number)
  {
    int size = name.length;
    int totalPayroll = 0;
    for (int i=0; i<size; i++)
    {
      Employee emp = new Employee(name[i], title[i], number[i]);
      totalPayroll += emp.salary();
    }
    return totalPayroll;
  }

  public int computePayroll2(String[] name, String[] title, 
                             int[] number)
  {
    int size = name.length;
    int totalPayroll = 0;
    if (size > 0)
    {
      Employee emp = new Employee();
      for (int i=0; i<size; i++)
      {
        emp.setName(name[i]);
        emp.setTitle(title[i]);
        emp.setNumber(number[i]);
        totalPayroll += emp.salary();
      }
    }
    return totalPayroll;
  }

  public static void main(String args[])
  {
    int val = Integer.parseInt(args[0]);
    test t = new test();
    String[] name = new String[10];
    String[] title = new String[10];
    int[] number = new int[10];
    for (int i=0; i<10; i++)
    {
      name[i]="Peter";
      title[i]="Advisory";
      number[i]= 123;
    }
    System.gc();
    long start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.computePayroll1(name, title, number);
    long end = System.currentTimeMillis();
    System.out.println("normal " + (end-start));
    long num = end-start;
    
    System.gc();
    start = System.currentTimeMillis();
    for (int i=0; i<val; i++)
      t.computePayroll2(name, title, number);
    end = System.currentTimeMillis();
    System.out.println("reuse " + (end-start));
    num = num/(end-start);
    System.out.println("reuse is " + num + " times faster");
  }
}
