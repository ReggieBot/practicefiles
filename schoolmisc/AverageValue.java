import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 5;

        int[] numberArray = new int[size];

        // Size of the Array
        System.out.println("Enter the following number of integers: " + size);

        // I spent a while trying to figure out how to get the size of the array from the user but couldn't figure it out. So I just used a fixed size array.
        // my guess is something like this but im not too sure
        // int[] array = new int[size];
        // and then setting size=scanner, but I'm not sure if that would mess with the for loop for calculating the sum
        // I probably could have figured it out but im really tired..
        
        for (int i = 0; i < size; i++) 
        {
            numberArray[i] = scanner.nextInt();
        }

        scanner.close();

        // getting sum of array
        int sum = 0;
        
        for (int i = 0; i < size; i++) 
        {
            sum += numberArray[i];
        }

        // Calculate the average of array
        double average = (double) sum / size;

        System.out.println("Average of the array: " + average);
    }
}

// why do we use 'i' in for loops? Most code I've seen uses 'i', is that just the standard?
