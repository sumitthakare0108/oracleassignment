abstract class Office
{
abstract public void addNewEmp();
public void calcAllowance(double salary)
{
System.out.println("Allowance will be "+salary*45/100);
}
}


final class Worker extends Office
{
//abstract public void show();
final public void calcTax(double salary)
{
System.out.println("Tax will be "+salary*3/100);
}
public void addNewEmp()
{
System.out.println("employee added...");
}
}

class TryAbstractFinal
{
public static void main(String args[])
{
Worker obj=new Worker();
obj.calcAllowance(34000);
obj.calcTax(73500);
obj.addNewEmp();
}
}