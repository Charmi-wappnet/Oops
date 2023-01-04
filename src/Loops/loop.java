package Loops;

import static java.lang.System.out;  
  
// For Loop

class ForLoop              
{              
    public static void main(String[] args)          
    {                     
       for(int i=0; i<=10; i++)  
       {  
           out.println(i);  
       }  
   }              
} 

// For Each Loop

class ForEachLoop              
{              
    public static void main(String[] args)          
    {              
       String ch[] = {"This is For Each Loop..."};  
         
       for (String j:ch)  
       {  
           out.println(j);  
       }  
         
    }                
} 

// While Loop

class WhileLoop              
{              
    public static void main(String[] args)          
    {              
        int i=0;  
        while (i<=10)   
        {  
            out.println(i);  
            i++;  
        }  
    }                
}   

// Do-while Loop

class doWhileLoop              
{              
    public static void main(String[] args)          
    {              
        int i=0;  
        do  
        {  
            out.println(i);  
            i++;  
        } 
        while (i<=10) ;  
    }                
}    