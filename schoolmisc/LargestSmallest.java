// I wasn't completely clear on if we needed to provide user input for the array, or if we just needed set values. 

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = 5; 

        int[] numberArray = new int[size];

        // user input 
        System.out.println("Enter the following number of elements:" + size);

        for (int i = 0; i < size; i++) {
            numberArray[i] = scanner.nextInt();
        }

        // realized in previous assignments I haven't been closing the scanner, which I now know can be a resource leak
        scanner.close();

        // This took me a while..
        int largest = numberArray[0];
        int smallest = numberArray[0];

        for (int i = 1; i < size; i++) {
            if (numberArray[i] > largest) {
                largest = numberArray[i];
            } else if (numberArray[i] < smallest) {
                smallest = numberArray[i];
            }
        }

        System.out.println("The largest integer is: " + largest);
        System.out.println("The smallest integer is: " + smallest);
    }
}
