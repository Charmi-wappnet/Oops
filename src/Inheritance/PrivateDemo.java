package Inheritance;

public class PrivateDemo
{
    private int a = 45;
    private String s = "Inhertance";
    
    public void show()
    {
        System.out.println("Private int a = "+a+"\nString s = "+s);
    }
    public static void main(String args[])
    {
        PrivateDemo pd = new PrivateDemo();
        pd.show();
        System.out.println(pd.a + " " + pd.s);
    }
}
