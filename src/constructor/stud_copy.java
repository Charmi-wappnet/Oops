package constructor;

class Stud_copy
{  
    int id;  
    String name;  

    Stud_copy(int i,String n){  
    id = i;  
    name = n;  
    }  

    Stud_copy(Stud_copy s){  
    id = s.id;  
    name =s.name;  
    }  
    void display()
    {
        System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
    Stud_copy s1 = new Stud_copy(45,"charmi");  
    Stud_copy s2 = new Stud_copy(s1);  
   
    s1.display();  
    s2.display();  
    }  
}  