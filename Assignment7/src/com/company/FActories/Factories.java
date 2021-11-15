package com.company.FActories;

interface CycleInterface
{
    public void type();
}
class UnicycleClass implements CycleInterface
{
    private UnicycleClass(){}
    @Override
    public void type() {
        System.out.println("unicycle");
    }
    public static UnicycleClass getUnicycleObject()
    {
        return new UnicycleClass();
    }
}
class BicycleClass implements CycleInterface
{
    private BicycleClass(){}
    @Override
    public void type() {
        System.out.println("Bicycle");
    }
    public static BicycleClass getBicycleObject()
    {
        return new BicycleClass();
    }
}
class TricycleClass implements CycleInterface
{
    private TricycleClass(){}
    @Override
    public void type() {
        System.out.println("Tricycle");
    }
    public static TricycleClass getTricycleObject()
    {
        return new TricycleClass();
    }
}
 class Factories {
    public static void main(String args[])
    {
        CycleInterface cycle=BicycleClass.getBicycleObject();
        cycle.type();
        cycle=UnicycleClass.getUnicycleObject();
        cycle.type();
        cycle=TricycleClass.getTricycleObject();
        cycle.type();
    }
}
