package MethodOverriding;

public class bank {
    int interest()
    {return 0;}   
}

class SBI extends bank 
{
    int interest()
    {return 8;}
}

class KOTAK extends bank 
{
    int interest()
    {return 7;}
}

class ICICI extends bank 
{
    int interest()
    {return 9;}
}

class Test 
{
    public static void main(String args[]) 
    {
        SBI s = new SBI();
        KOTAK k = new KOTAK();
        ICICI i = new ICICI();

        System.out.println("SBI bank interest: " + s.interest());
        System.out.println("KOTAK bank interest: " + k.interest());
        System.out.println("ICICI bank interest: " + i.interest());
    }
}
