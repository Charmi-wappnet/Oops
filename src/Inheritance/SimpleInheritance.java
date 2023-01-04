package Inheritance;

class SuperDemo
{
     int result;
     public void square(int a)
     {
         result = a * a;
         System.out.println("The square of the "+a+" is: "+result);
     }
}
public class SimpleInheritance extends SuperDemo
{    
     public void cube(int a)
     {
         result = a * a * a;
         System.out.println("The cube of the "+a+" is: "+result);
     }
      public static void main(String args[])
     {
         int a = 20;
         SimpleInheritance sub = new SimpleInheritance();
         sub.square(a);
         sub.cube(a);
     }
}
