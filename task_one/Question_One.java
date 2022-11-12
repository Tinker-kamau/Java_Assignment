package task_one;

//importing Scanner 
import java.util.Scanner;

public class Question_One {
    public static void main(String[] args) {

        // My scanner object
        Scanner input = new Scanner(System.in);

        // variables
        String sir_name;
        String number_type;
        int age;
        int number_of_letters;

        // input the name
        System.out.println("Enter your sir name :");
        sir_name = input.nextLine();
        // input the age
        System.out.println("Enter your age :");
        age = input.nextInt();

        // getting number of letters in sir name
        number_of_letters = sir_name.length();

        // if age is even or odd
        if (age % 2 == 0) {
            number_type = "even";
            // Display output
            System.out.println("The number of letters in your sir name is : " + number_of_letters);
            System.out.println("Your current age is an " + number_type + " number.");
        } else {
            number_type = "odd";
            // Display output
            System.out.println("Your sir name has : " + number_of_letters + " characters");
            System.out.println("Your current age is an " + number_type + " number.");
        }
    }
}