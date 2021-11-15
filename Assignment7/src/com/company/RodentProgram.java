package com.company;

abstract class Rodent
{
    abstract public void eat();
    abstract public void run();
}
class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("Mouse class object is created");
    }
    @Override
    public void eat()
    {
        System.out.println("Mouse is eating");
    }
    @Override
    public void run()
    {
        System.out.println("Mouse is running");
    }
}
class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("Gerbil class object is created");
    }
    @Override
    public void eat()
    {
        System.out.println("Gerbil is eating");
    }
    @Override
    public void run()
    {
        System.out.println("Gerbil is running");
    }
}
class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("Hamster class object is created");
    }
    @Override
    public void eat()
    {
        System.out.println("Hamster is eating");
    }
    @Override
    public void run()
    {
        System.out.println("Hamster is running");
    }
}
public class RodentProgram {
    public static void main(String args[]) {
        Rodent rodent[] = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        for (int index = 0; index < 3; index += 1) {
            rodent[index].eat();
            rodent[index].run();
        }
    }
}