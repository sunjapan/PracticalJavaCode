interface Employee
{
  public int salary();
}

class Manager implements Employee
{
  private static final int mgrSal = 40000;
  public int salary()
  {
    return mgrSal;
  }
}

class Programmer implements Employee
{
  private static final int prgSal = 50000;
  private static final int prgBonus = 10000;
  public int salary()
  {
    return prgSal;
  }

  public int bonus()
  {
    return prgBonus;
  }
}

class Payroll
{
  public int calcPayroll(Employee emp)
  {
    int money = emp.salary();
    if (emp instanceof Programmer)
      money += ((Programmer)emp).bonus();  //Calculate the bonus
    return money;
  }

  public static void main(String args[])
  {
    Payroll pr = new Payroll();
    Programmer prg = new Programmer();
    Manager mgr = new Manager();
    System.out.println("Payroll for Programmer is " +
                       pr.calcPayroll(prg));

    System.out.println("payroll for Manager is " +
                       pr.calcPayroll(mgr));
  }
}