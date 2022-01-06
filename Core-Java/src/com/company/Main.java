package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int sumValue = number1 + number2;
        System.out.println(sumValue);
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        switch (number3) {

            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");

            default:
                System.out.println("please enter correct number");
        }
        for(int i=1;i<=number1;i++){
            if(i==5)
                break;

            System.out.println(i);
        }
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        ArrayList<Integer> arrli
                = new ArrayList<Integer>(number1);


        for (int i = 1; i <= number1; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(arrli);
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");
        Stack stack1 = new Stack();

        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements
        stack1.push(4);
        stack1.push("All");
        stack1.push("sharath");

        stack2.push("bharath");
        stack2.push("Zemoso");
        stack2.push("labs");

        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
    }


