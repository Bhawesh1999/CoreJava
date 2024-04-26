package CoreJava;

import java.util.Arrays;

public class ClassA164 {
    enum Days {
        friday, saturday
    }

    void meth1() {
        System.out.println("implementing enum");
        Days d = Days.friday;
        System.out.println(d);

        switch (d) {
            case friday:
                System.out.println("today is " + d);
                System.out.println("today is the last class for core java");
                break;
            case saturday:
                System.out.println("today is saturday");
                System.out.println("today we are not having any core java class");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    void meth2() {
        Days[] arr = Days.values();

        for (Days data : arr) {
            System.out.println(data);
        }
        System.out.println("------");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        new ClassA164().meth1();
    }
}
