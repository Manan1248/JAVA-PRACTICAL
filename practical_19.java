public class practical_19 
{
    public static void main(String[] args) 
    {
        square s1 = new square();
        
        s1.print();

        s1.print1();

        s1.print3();
    }    
}

class shape
{
    void print()
    {
        System.out.println("This is a shape");
    }
}

class rectangle extends shape
{
    void print1()
    {
        System.out.println("This is a rectangle");
    }
}

class circle extends shape
{
    void print2()
    {
        System.out.println("This is a circle");
    }
}

class square extends rectangle
{
    void print3()
    {
        System.out.println("Square is  a Rectangle");
    }
}
