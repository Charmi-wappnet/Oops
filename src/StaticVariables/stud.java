package StaticVariables;

class Student 
{
    int rollno;
    String name;
    static String college = "RKU";

    Student(int r,String n){
    rollno = r;
    name = n;
}
  void display()
  {
     System.out.println(rollno + " " + name + " " + college);
  }
}

public class stud 
{
    public static void main(String args[])
    {
       Student s1 = new Student(45, "Charmi");
       Student s2 = new Student(37, "Payal");       
   
       s1.display();
       s2.display();
   }
}