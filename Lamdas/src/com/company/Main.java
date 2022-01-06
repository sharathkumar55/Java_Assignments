package com.company;

public class Main {

    interface Greeting
    {
        public String sayHello(String s);
    }
    public void testGreetings(String a,Greeting g)
    {
        String result=g.sayHello(a);
        System.out.println("result : "+result);
    }

    public static void main(String[] args) {
        new Main().testGreetings("Hey",(String s)->"Hi, "+s);
        new Main().testGreetings("Zemoso",(String s)->"Hello, "+s);
        new Main().testGreetings("Labs",(String s)->!s.isEmpty()?"Hello, "+s:"did you missed ");
    }
}
