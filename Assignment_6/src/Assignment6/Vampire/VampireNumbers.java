package Assignment6.Vampire;

import java.util.ArrayList;

public class VampireNumbers {
    public static ArrayList<Integer> list=new ArrayList<Integer>();
    private static void permuteHelper(int[] arr, int index){
        if(index >= arr.length - 1){
            StringBuilder s = new StringBuilder();

            for (int i : arr)
            {
                s.append(i);
            }

            list.add(Integer.parseInt(s.toString()));

            return;
        }

        for(int i = index; i < arr.length; i++){
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
            permuteHelper(arr, index+1);

            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }
    public static void main(String args[]){
        int n=1;
        int number=1260;
        while(n<=100) {
            int[] array = digitArray(number);
            permuteHelper(array, 0);
            ArrayList<Integer> permuteList=permuteArray();
            int flag = 0;
            for (int i : permuteList) {
                String s = String.valueOf(i);
                if (s.length() % 2 == 0) {
                    int firstPart = Integer.parseInt(s.substring(0, s.length() / 2));
                    int secondPart = Integer.parseInt(s.substring(s.length() / 2));
                    if ((firstPart % 10 == 0) && (secondPart % 10 == 0)) {
                        continue;
                    }
                    if (firstPart * secondPart == number) {
                        System.out.println(number+" "+firstPart+" "+secondPart);
                        n=n+1;
                        break;
                    }

                }
            }
            number=number+1;

        }
    }

    private static ArrayList<Integer> permuteArray() {
        ArrayList<Integer> array=new ArrayList<Integer>(list);
        list.clear();
        return array;
    }

    private static int[] digitArray(int number) {
        String temp = Integer.toString(number);
        int[] array = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            array[i] = temp.charAt(i) - '0';
        }
        return array;

    }
}
