package Inheritance;

class Employee
{
    protected int id = 101;
    protected String name = "Jack";
}
class ProtectedDemo extends Employee
{
    private String dept = "Networking";
    public void display()
    {
        System.out.println("Employee Id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee Department : "+dept);
    }
    public class protect {
    public static void main(String args[])
    {
        ProtectedDemo pd = new ProtectedDemo();
        pd.display();
    }
}
}

