package Inheritance;

class Employee
{
    protected int id = 89;
    protected String name = "Charmi";
}

public class ProtectedDemo extends Employee
{
    private String dept = "Development";
    
    public void display()
    {
        System.out.println("Employee Id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee Department : "+dept);
    }
    public static void main(String args[])
    {
        ProtectedDemo pd = new ProtectedDemo();
        pd.display();
    }
}