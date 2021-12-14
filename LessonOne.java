/**
 * Java 1. Lesson 1.
 *
 * Svetlana Arakelian
 * version 1. Dated 11.12.2021.
 */


public class LessonOne {
    public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
    }
    static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
    }

    static void checkSumSign() {
        int a=5;
        int b=5;
        if (a+b>=0) {
            System.out.println("Sum is positive");
    }   else
            System.out.println("Sum is negative");
    }

    static void printColor() {
        int value=7;
        if (value<=0) {
            System.out.println("Red");
    }
        if (value>0 && value<100) {
            System.out.println("Yellow");
    }
        if (value>100) {
            System.out.println("Green");
    }
}

    static void compareNumbers() {
        int a=14;
        int b=2;
        if (a>=b) {
            System.out.println("a > = b");
        } else {
            System.out.println("a < b");
    }
  }
 }






