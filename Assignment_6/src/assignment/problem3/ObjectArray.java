package assignment.problem3;

public class ObjectArray {
    ObjectArray(String temp) {

        System.out.println("The value  is " + temp);
    }

    public static void main(String args[]) {
        ObjectArray object[] = new ObjectArray[10];
        for (int i = 0; i < 5; i++) {
            object[i] = new ObjectArray("Hello");
        }
    }
}
