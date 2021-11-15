package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int position=0;
        int flag=0;
        str = str.toLowerCase();
        boolean[] alphaTestArray = new boolean[26];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
            {
                position = str.charAt(i)-'a';
            }

            alphaTestArray[position]=true;

        }
        for(int i=0;i<26;i++)
        {
            if(alphaTestArray[i]==false)
            {
                flag=1;
                break;

            }


        }
        if(flag==1)
            System.out.println("Given String doesn't contains all alphabets");
        else
            System.out.println(" Given String contains all aplhabets in a string");
    }
}
/* Time complexity : O(n) where n is length of given string
    Space complexity  : O(k) where k is the size of alphaTestArray  size
 */
