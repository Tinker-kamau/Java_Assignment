package task_one;

//Sannner import
import java.util.Scanner;

public class Question_Three {

    // This method is for testing divisibility of the argument by 0
    static void test0Div(int inputNumber) {
        System.out.println(inputNumber + " cannot be divisible by 0.");
    }

    // This method is for testing divisibility of the argument by 1
    static void test1Div(int inputNumber) {
        System.out.println(inputNumber + " is divisible by 1.");
    }

    // This method is for testing divisibility of the argument by 2
    static void test2Div(int inputNumber) {
        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is divisible by 2.");
        } else {
            System.out.println(inputNumber + " is not divisible by 2.");
        }
    }

    // This method is for testing divisibility of the argument by 3
    static void test3Div(int inputNumber) {
        if ((inputNumber % 3) == 0) {
            System.out.println(inputNumber + " is divisible by 3");
        } else {
            System.out.println(inputNumber + " is not divisible by 3");
        }
    }

    // This method is for testing divisibility of the argument by 4
    static void test4Div(int inputNumber) {
        if ((inputNumber % 4) == 0) {
            System.out.println(inputNumber + " is divisible by 4");
        } else {
            System.out.println(inputNumber + " is not divisible by 4");
        }
    }

    // This method is for testing divisibility of the argument by 5
    static void test5Div(int inputNumber) {
        if ((inputNumber % 5) == 0) {
            System.out.println(inputNumber + " is divisible by 5");
        } else {
            System.out.println(inputNumber + " is not divisible by 5");
        }
    }

    // This method is for testing divisibility of the argument by 6
    static void test6Div(int inputNumber) {
        if ((inputNumber % 6) == 0) {
            System.out.println(inputNumber + " is divisible by 6");
        } else {
            System.out.println(inputNumber + " is not divisible by 6");
        }
    }

    // This method is for testing divisibility of the argument by 7
    static void test7Div(int inputNumber) {
        if ((inputNumber % 7) == 0) {
            System.out.println(inputNumber + " is divisible by 7");
        } else {
            System.out.println(inputNumber + " is not divisible by 7");
        }
    }

    // This method is for testing divisibility of the argument by 8
    static void test8Div(int inputNumber) {
        if ((inputNumber % 8) == 0) {
            System.out.println(inputNumber + " is divisible by 8");
        } else {
            System.out.println(inputNumber + " is not divisible by 8");
        }
    }

    // This method is for testing divisibility of the argument by 9
    static void test9Div(int inputNumber) {
        if ((inputNumber % 9) == 0) {
            System.out.println(inputNumber + " is divisible by 9");
        } else {
            System.out.println(inputNumber + " is not divisible by 9");
        }
    }

    // the main method
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        int numToTest;
        // getting input
        System.out.println("This program checks if numbers are divisibile by zero to 9. Enter any number :");
        numToTest = input.nextInt();

        // calling the methods shown above
        test0Div(numToTest);
        test1Div(numToTest);
        test2Div(numToTest);
        test3Div(numToTest);
        test4Div(numToTest);
        test5Div(numToTest);
        test6Div(numToTest);
        test7Div(numToTest);
        test8Div(numToTest);
        test9Div(numToTest);
    }
}
