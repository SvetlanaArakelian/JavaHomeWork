/**
 * Java 1. Lesson 2.
 *
 * Svetlana Arakelian
 * version 1. Dated 13-14.12.2021.
 */

public class LessonTwo {
    public static void main(String[] args) {
        System.out.println(checkWithin10and20(3, 8));
        makeTask2(28);
        System.out.println(makeTask3(-5));
        doStrings("To be or not to be", 10);
    }

    static boolean checkWithin10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    static void makeTask2(int x) {
        if (x >= 0) {
            System.out.println("The Number is positive");
        }
        else {
            System.out.println("The Number is negative");
        }
    }

    static boolean makeTask3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    static void doStrings(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
 }