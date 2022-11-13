package Question_Three.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class Triangle {

    static double baseTriangle, heightTriangle, area;

    // input the baseTriangle and the heightTriangle
    void getInMeasurements() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base of the triangle: ");
        baseTriangle = input.nextDouble(); // store the input in baseTriangle
        System.out.println("Enter the height of the triangle: ");
        heightTriangle = input.nextDouble(); // store the input in heightTriangle
    }

    // find the area of the rectangle
    void findArea() {
        area = 0.5 * baseTriangle * heightTriangle;
    }

    // method to output area
    void outputResults() {
        System.out.println("The area is: " + area);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static methods
        Triangle objectOfThisClass = new Triangle();
        objectOfThisClass.getInMeasurements();
        objectOfThisClass.findArea();
        objectOfThisClass.outputResults();
    }
}
