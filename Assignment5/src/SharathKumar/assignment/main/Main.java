package SharathKumar.assignment.main;
import sharath.assignment.singleton.SingletonClass;
import Sharath.assignment.data.Data;
public class Main {

    public static void main(String[] args)
    {
        Data obj = new Data();
        obj.printMemberVariables();
        obj.method2();
        SingletonClass singleObj = new SingletonClass();
        singleObj.initialize("Hey Zemoso");
        singleObj.printDetails();

    }
}
