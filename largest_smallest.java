// I wasn't completely clear on if we needed to provide user input for the array, or if we just needed set values. 

import java.util.Scanner;

public class largest_smallest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = 5; 

        int[] array = new int[size];

        // user input 
        System.out.println("Enter " + size + " elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // realized in previous assignments I haven't been closing the scanner, which I now know can be a resource leak
        scanner.close();

        // This took me a while..
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("The largest integer is: " + largest);
        System.out.println("The smallest integer is: " + smallest);
    }
}