package com.company;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static  String calculatePercentage()
    {
        return "This method returns calculated Percentage";
    }

    public static void main(String[] args) {

            String studentName;
            Scanner sc = new Scanner(System.in);
            studentName = sc.nextLine();
            StringBuffer reverseTheString = new StringBuffer(studentName);
            reverseTheString.reverse();
            System.out.println(reverseTheString);
            LocalDateTime currentTime = LocalDateTime.now();
            System.out.println("Current Time is "+currentTime);
            System.out.println(calculatePercentage());

    }
}
