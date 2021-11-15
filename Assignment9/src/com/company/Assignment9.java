package com.company;

import java.util.*;
import java.util.regex.*;
public class Assignment9 {
    public static void method(Pattern pattern,String sentence)
    {
        Matcher match=pattern.matcher(sentence);
        if(match.find())
        {
            System.out.println(sentence+" Starts with Capital letter and ends with period");
        }
        else {
            System.out.println(sentence + " do not Starts with Capital letter and ends with period");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        Pattern pattern =Pattern.compile("^[A-Z].*\\.");
        method(pattern,sentence);
    }
}
