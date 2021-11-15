package sharath.assignment.singleton;


public class SingletonClass {
     String other;
    public SingletonClass initialize(String str) {
        SingletonClass obj = new SingletonClass();
        other = str;
        return obj;
    }
    public  void printDetails()
    {
        System.out.println("the value is in SingletonClass is "+other);
    }

}
