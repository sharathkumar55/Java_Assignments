package com.company;

import java.util.concurrent.Callable;

public class RunnableImplementation {
    public void methodAcceptingRunnable(Runnable e){}
    public void methodAcceptingCallable(Callable c){}
    private static void email(){}
    private static void persist(){}
    public static void main(String[] args) {
        Runnable runnable=()-> System.out.println("Hello, lambda");
        new RunnableImplementation().methodAcceptingRunnable(runnable);

        new RunnableImplementation().methodAcceptingRunnable(()->{
            System.out.println("complex lambda");
            persist();
            email();
        });

        Callable callable=()->"Hello, Callable";
        new RunnableImplementation().methodAcceptingCallable(callable);
        new RunnableImplementation().methodAcceptingCallable(()->{
            return "complex callable";
        });

    }
    interface Tradable<Trade>
    {
        boolean check(Trade t);
    };
    Tradable<Trade> bigTradeLambda=(trade)->trade.doYouTrade();
}
