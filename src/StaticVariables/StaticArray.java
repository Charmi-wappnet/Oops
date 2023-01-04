package StaticVariables;

public class StaticArray {

private static String[] array;  
static   
{  
array = new String[5];  
array[0] = "Heartly";  
array[1] = "welcome";
array[2] = "from";
array[3] = "Charmi";
array[4] = "Jethva"; 
}  
public static void main(String args[])   
{  
for(int i = 0; i < array.length; i++)  
{  
System.out.print(array[i] + " ");  
}  
}  
}  

