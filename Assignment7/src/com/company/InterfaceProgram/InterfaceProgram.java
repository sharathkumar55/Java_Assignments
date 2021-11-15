package com.company.InterfaceProgram;

interface Interface1
{
    public void method1FromInterface1();
    public void method2FromInterface1();
}
interface Interface2
{
    public void method1FromInterface2();
    public void method2FromInterface2();
}
interface Interface3
{
    public void method1FromInterface3();
    public void method2FromInterface3();
}
interface CombinedInterface  extends Interface1,Interface2,Interface3
{
    public void methodFromCombinedInterface();
}

class Implementation implements CombinedInterface
{
    public void method1FromInterface1()
    {
        System.out.println("Method1 from Interface1");
    }
    public void method2FromInterface1()
    {
        System.out.println("Method2 from Interface1");
    }
    public void method1FromInterface2()
    {
        System.out.println("Method1 from Interface2");
    }
    public void method2FromInterface2()
    {
        System.out.println("Method2 from Interface2");
    }
    public void method1FromInterface3()
    {
        System.out.println("Method1 from Interface3");
    }
    public void method2FromInterface3()
    {
        System.out.println("Method2 from Interface3");
    }
    public void methodFromCombinedInterface()
    {
        System.out.println("Method from NewInterface");
    }
}
class Calling
{
    public void callingInterface1(Interface1 interface1)
    {
        interface1.method1FromInterface1();
        interface1.method2FromInterface1();
    }
    public void callingInterface2(Interface2 interface2)
    {
        interface2.method1FromInterface2();
        interface2.method2FromInterface2();
    }
    public void callingInterface3(Interface3 interface3)
    {
        interface3.method1FromInterface3();
        interface3.method2FromInterface3();
    }
    public void callingCombinedInterface(CombinedInterface interfaceObject)
    {
        interfaceObject.methodFromCombinedInterface();
    }
}
 class InterfacesProgram {
    public static void main(String args[])
    {
        Calling calling=new Calling();
        Implementation implementation=new Implementation();
        calling.callingInterface1(implementation);
        calling.callingInterface2(implementation);
        calling.callingInterface3(implementation);
        calling.callingCombinedInterface(implementation);
    }
}