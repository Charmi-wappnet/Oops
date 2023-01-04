package constructor;

class Stud
  {  
    int id;  
    String name;  

    Stud(int i,String n)
    {  
    id = i;  
    name = n;  
    }  

    void display()
    {
        System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
       Stud s1 = new Stud(45,"charmi");  
       Stud s2 = new Stud(21,"Aryan");  

       s1.display();  
       s2.display();  
    }  
}  