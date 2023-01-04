package constant;

public class ConstantExample {
    private static final double PRICE=2999;  
public static void main(String[] args)  
{  
System.out.println("Old Price of Iron: "+PRICE);  
ConstantExample1 obj = new ConstantExample1();  
obj.showPrice();  
}  
}  
class ConstantExample1  
{  
private static final double PRICE=3599;  
void showPrice()  
{  
System.out.print("New Price of Iron: "+PRICE);  
}  
}  

