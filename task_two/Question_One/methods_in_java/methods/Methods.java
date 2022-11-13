package Question_One.methods_in_java.methods;

import java.util.Scanner; //Scanner import

public class Methods {

    // get the smallest number
    static double smallNum(double num_1, double num_2, double num_3) {

        if (num_1 < num_2) {
            if (num_1 < num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 < num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    // get largest number
    static double largeNum(double num_1, double num_2, double num_3) {

        // get largest number
        if (num_1 > num_2) {
            if (num_1 > num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 > num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    // main method
    public static void main(String[] args) {

        // variables
        double firstnum, secondnum, thirdnum, smallnum, largenum;

        Scanner input = new Scanner(System.in);// scanner object

        // getting input
        System.out.println("\nEnter the first number: ");
        firstnum = input.nextInt(); // input first number
        System.out.println("Enter the second number: ");
        secondnum = input.nextInt(); // input second number
        System.out.println("Enter the third number: ");
        thirdnum = input.nextInt(); // input third number

        // get return values fom the methods
        smallnum = smallNum(firstnum, secondnum, thirdnum);
        largenum = largeNum(firstnum, secondnum, thirdnum);

        // output
        System.out.println("\nThe smallest number: " + smallnum);
        System.out.println("The largest number: " + largenum);
        System.out.println(largenum + " is your largest and " + smallnum + " is the smallest number.");
    }
}
