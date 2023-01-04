package Inheritance;

class Parent
{
    public void m1()
    {
       System.out.println("Class Parent method");
    }
}
public class Child extends Parent
{
   public void m2()
   {
      System.out.println("Class Child method");
   }
   public static void main(String args[])
   {
      Child obj = new Child();
      obj.m1();
      obj.m2();
   }
}


