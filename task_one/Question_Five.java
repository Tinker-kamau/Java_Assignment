package task_one;

import java.util.Scanner; //importing Scanner

public class Question_Five {

    // oerations method does the calculations
    static void operations(double first_num, double second_num, char mathOperator) {

        Double resultFromOperation; // for storing the results

        switch (mathOperator) {
            // addition
            case '+':
                resultFromOperation = first_num + second_num;
                System.out.println("The result is: " + resultFromOperation);
                break;

            // subtraction
            case '-':
                resultFromOperation = first_num - second_num;
                System.out.println("The result is: " + resultFromOperation);
                break;

            // multiplication
            case '*':
                resultFromOperation = first_num * second_num;
                System.out.println("The result is: " + resultFromOperation);
                break;

            // division
            case '/':
                resultFromOperation = first_num / second_num;
                System.out.println("The result is: " + resultFromOperation);
                break;

            default:
                System.out.println("Seems you made a mistake somewhere. Try again.");
                break;
        }
    }

    
    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object

        System.out.println("Enter the first number");
        Double first_num;
        first_num = input.nextDouble(); // input first number

        // request the the mathOperator from the user
        System.out.println("Enter your mathOperator (+, -, *, /): ");
        char mathOperator;
        mathOperator = input.next().charAt(0); // input the mathOperator

        // request the second number from the user
        System.out.println("Enter second number");
        Double second_num;
        second_num = input.nextDouble(); // input second number

        operations(first_num, second_num, mathOperator);
    }
}
