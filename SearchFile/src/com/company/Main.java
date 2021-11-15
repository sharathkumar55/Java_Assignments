package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int flag=0;
        File files = new File("/home/sharkt");
        String[] allFiles = files.list();
        String fileName;
        while(true)
        {
            System.out.println("Enter File Name ");
            fileName = sc.nextLine();
            for(String temp : allFiles)
            {
                if(fileName.equals(temp))
                {
                    flag=1;
                    System.out.println(temp+" file found at "+files.getAbsolutePath());
                }

            }
            if(flag==0)
                System.out.println("File not found ");

        }
    }
}
