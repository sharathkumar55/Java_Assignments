package com.company.InheritanceProgram;

class Cycle
{
}
class Unicycle extends Cycle
{
    public void balance()
    {
        System.out.println("Balance method from unicycle");
    }
}
class Bicycle extends Cycle
{
    public void balance()
    {
        System.out.println("Balance method from Bicycle");
    }
}
class Tricycle extends Cycle
{

}
 class InheritenceProgram {

    public static void main(String args[])
    {
        Cycle cycle[]=new Cycle[3];
        //upcasting
        cycle[0]=new Unicycle();
        cycle[1]=new Bicycle();
        cycle[2]=new Tricycle();
        /*cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();
                we get an error called method balance() not found because
                we are not defined in superclass or parent class
         */


        Unicycle unicycle=new Unicycle();
        unicycle.balance();
        Bicycle bicycle=new Bicycle();
        bicycle.balance();


    }
}
