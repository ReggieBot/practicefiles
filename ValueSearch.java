import java.util.Scanner;

public class ValueSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = 5;

        int[] array = {1, 2, 69, 3, 4};

        // Get user value to search for
        System.out.print("Please enter the integer to search for in the array: ");
        
        int userValue = scanner.nextInt();


        // Check if it contains the user value
        boolean foundValue = false;
       
        // iterates through loop checking if array element == userValue
        for (int i = 0; i < size; i++) 
        {
            if (array[i] == userValue) 
            {
                foundValue = true;
                break; 
                // using a break and boolean condition so if value is found it exits
            }
        }

        scanner.close();

        if (foundValue) 
        {
            System.out.println("That value has been found in the array");
        } 
        else 
        {
            System.out.println("Sorry, that value is not in the array");
        }
    }
}
// I was thinking about adding an extra function to check at what index the user value was found, but couldn't figure out how to implement it.
// Im thinking setting i = position of the array?