package Assignment_6;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number ");
        int number = keyboard.nextInt();

        int factorial = factorialCalc(number);
        
        System.out.println(factorial);
    }


    // method

    public static int factorialCalc(int number) {
    // the factorial of 0 is = 1, so I added a check
        if (number == 0) {
            return 1;
        }
        else {

            int factorial = 1;

            // using for loop to calculate the factorial.
            // I did this by multiplying the factorial by each number from 1 - user input number
            for (int i = 1; i <= number; i++) { // continue looping if i <= user number
                factorial *= i;
            }

            return factorial; // return the calculated factorial
        }
    }

}
