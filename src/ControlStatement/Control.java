package ControlStatement;

import static java.lang.System.out;    
    
// If....condition..

class if_statement                
{                
    public static void main(String[] args)            
    {        
        int i=4;  
        if (i<5)   
        {  
            out.println(i);  
        }  
    }                  
}      

// If...else

class If_else               
{                
    public static void main(String[] args)            
    {        
        int i=10;  
        if (i<5)   
        {  
            out.println(i);  
        }  
        else  
        {  
            out.println(i/2);  
        }  
    }                  
}     

// if-else-if 

class if_else_if                
{                
    public static void main(String[] args)            
    {        
        int i=1000;  
        if (i<5)   
        {  
            out.println(i);  
        }  
        else if (i>5)  
        {  
            out.println(i/3);  
        }  
        else  
        {  
            out.println(i/2);  
        }  
    }                  
}     

// Nested if...

class Nested_if              
{              
    public static void main(String[] args)          
    {              
        int i=0;  
        if(i==0)  
        {  
            out.print(0);  
        }  
        else if(i<5)  
        {  
            out.print("lesser");  
        }  
        else if(i>5)  
        {  
            out.print("greater");  
        }  
        else  
        {  
            out.print(i);  
        }  
    }                
}    

// Switch case

class Switch_case              
{              
    public static void main(String[] args)          
    {              
        int i=0;  
        switch(i)  
        {  
            case 0:   
            case 1:  
            case 2:   
            case 3:  
            case 4:  
            case 5:  
            case 6:out.print(i);  
                    break;  
            default: out.print("No value");                     
        }  
    }                
}     

// Break Statement

class BreakStatement              
{              
    public static void main(String[] args)          
    {              
        for (int i = 0; i < 10; i++)   
        {  
            if (i>4)  
                break;  
            else  
                out.print(i);  
        }  
    }                
}  

// Continue...

class ContinueStatement              
{              
    public static void main(String[] args)          
    {              
        for (int i = 0; i < 10; i++)   
        {  
            if (i>4 && i<7)  
            {  
                continue;  
                  
            }  
            else  
                out.print(i);  
        }  
    }                
}     