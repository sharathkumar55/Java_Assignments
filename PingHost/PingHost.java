package com.company;
import java.io.*;
import java.util.*;

public class PingHost {

    static void commands(ArrayList<String> commandList)
            throws Exception {

        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        //  System.out.println(input.readLine());
        BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String s = null;
        int position;
        ArrayList<Float> totalTimeList = new ArrayList<Float>();
        //System.out.println("output is  ");
        while ((s = input.readLine()) != null) {
            position = s.indexOf("time=");
            if (position != -1) {
                int y = s.indexOf("ms", position + 5);
                Float value = Float.parseFloat(s.substring(position + 5, y));
                totalTimeList.add(value);

            }
        }
        Collections.sort(totalTimeList);
        int size = totalTimeList.size();
        float median;
        if (size % 2 == 1) {
            median = (Float) totalTimeList.get(size / 2);
        } else {
            median = ((Float) totalTimeList.get(size / 2) + (Float) totalTimeList.get(size / 2 + 1)) / 2.0F;
        }

        System.out.println("Median time is " + median);

    }

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int numberoftimes;
        String urlName;
        System.out.println("enter number of times ");
        numberoftimes = sc.nextInt();
        String times=String.valueOf(numberoftimes);
        System.out.println("enter Url");
        urlName = sc.next();
        ArrayList<String> commandList = new ArrayList<String>();


        commandList.add("ping");
        commandList.add("-c");
        commandList.add(times);

        commandList.add(urlName);

        PingHost.commands(commandList);
    }
}
