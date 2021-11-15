package com.company.InnerClass;

class OuterClass
{
    class InnerClass
    {
        InnerClass(String name)
        {
            System.out.println("name is:"+name);
        }
    }
}
class SecondClass extends OuterClass
{
    public void method() {
        OuterClass.InnerClass classobject = new InnerClass("Sharath");
    }
}
 class InnerClassProgram {
    public static void main(String args[])
    {
        SecondClass object=new SecondClass();
        object.method();

    }
}
