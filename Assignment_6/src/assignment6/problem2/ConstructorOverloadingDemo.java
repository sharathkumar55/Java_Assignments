package assignment6.problem2;

public class ConstructorOverloadingDemo {
    String value;

    public ConstructorOverloadingDemo(String temp)
    {
        this();
        value=temp;
        System.out.println("the value is "+value);
    }
    public ConstructorOverloadingDemo()
    {
        System.out.println("Default Constructor");
    }
    public static void main(String args[])
    {
        ConstructorOverloadingDemo obj = new ConstructorOverloadingDemo("Hello");
    }
}
