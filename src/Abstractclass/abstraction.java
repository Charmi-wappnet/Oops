package Abstractclass;

abstract class abstraction {

    abstract void draw();
}

class Rectangle extends abstraction 
{
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

class circle extends abstraction
{
    void draw()
    {
        System.out.println("Drawing circle");
    }
}

class shape
{
    public static void main(String args[])
    {
        abstraction a = new circle();
        a.draw();
    }
}