package task_one;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question_Four {

    // main method
    public static void main(String[] args) {

        // Creating my list to store 71-150
        List<Integer> myList = IntStream.range(71, 150).boxed().collect(Collectors.toList());

        myList.add(150); // adding last item

        // calling my methods to print the output
        multiplesOf2(myList);
        multiplesOf3(myList);
        multiplesOf7(myList);
    }

    // This method returns a list of multiples of 2
    static void multiplesOf2(List<Integer> myList) {
        System.out.println("\n\n2 has the following multiples:");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.println(myList.get(i));
            }
            if (i == 150 - 71) {
                    break;
                }

        }
    }

    // This method returns a list of multiples of 3
    static void multiplesOf3(List<Integer> myList) {
        System.out.println("\n\n3 has the following multiples:");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 3 == 0) {
                System.out.println(myList.get(i));
            }
            if (i == 150 - 71) {
                    break;
                }

        }
    }

    // This method returns a list of multiples of 7
    static void multiplesOf7(List<Integer> myList) {
        System.out.println("\n\n7  has the following multiples:");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 7 == 0) {
                System.out.println(myList.get(i));
            }
            if (i == 150 - 71) {
                    break;
                }

        }
    }
}
