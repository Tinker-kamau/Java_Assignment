package task_one;

import java.util.Scanner; //importing Scanner

public class Question_Two {

    public static void main(String[] args) {

        // my scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for the units you did on last semester to get the average.");

        // getting the units as entered at the console
        System.out.println("Unit 1: ");
        double unit_1;
        unit_1 = input.nextDouble();
        System.out.println("Unit 2: ");
        double unit_2;
        unit_2 = input.nextDouble();
        System.out.println("Unit 3: ");
        double unit_3;
        unit_3 = input.nextDouble();
        System.out.println("Unit 4: ");
        double unit_4;
        unit_4 = input.nextDouble();
        System.out.println("Unit 5: ");
        double unit_5;
        unit_5 = input.nextDouble();

        // calling findAverage method and putting the return value in variable average
        double average = findAverage(unit_1, unit_2, unit_3, unit_4, unit_5);

        System.out.println("\nYour average mark is: " + average);
    }

    // this method calculates the average. it returns a double
    static double findAverage(double unit1, double unit2, double unit3, double unit4, double unit5) {

        // finding the average
        double average;
        average = (unit1 + unit2 + unit3 + unit4 + unit5) / 5;

        // rounding the average to 2dp
        var AVG = Math.round(average * 100.0) / 100.0;

        return AVG;
    }

}
