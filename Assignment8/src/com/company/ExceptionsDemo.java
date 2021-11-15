package com.company;

import java.util.Scanner;

class OddNumberException extends Exception
{
    OddNumberException(String exception)
    {
        super(exception);
    }
}
class NumberEqualToZero extends Exception
{
    NumberEqualToZero(String exception)
    {
        super(exception);
    }
}
class StringLengthLessThanFive extends Exception
{
    StringLengthLessThanFive(String exception)
    {
        super(exception);
    }
}
public class ExceptionsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        try
        {
            if(number1==0)
                throw new NumberEqualToZero("Number is equal to zero");
            if(name.length()<5)
                throw new StringLengthLessThanFive("length of string is less than 5");
            if(number2%2==1)
                throw new OddNumberException("Number is a odd number");

        }
        catch(Exception object)
        {
            System.out.println(object);
        }
        finally
        {
            System.out.println("Final Method is Executed");
        }
    }
}
