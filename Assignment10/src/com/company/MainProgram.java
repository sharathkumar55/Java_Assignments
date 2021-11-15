package com.company;

public class MainProgram
{
    public static void main(String[] args){


        SList<String> list=new SList<>();
        SListIterator<String> it=new SListIterator<>(list);
        it.add("M");
        System.out.println(list.toString());
        it.add("N");
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.add("a");
        it.add("c");
        it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());

    }
}