import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the first integer: ");
    
    int firstInt = keyboard.nextInt();

    System.out.println("Please enter the second integer: ");

    int secondInt = keyboard.nextInt();

    int sum = firstInt + secondInt;

    System.out.println("The sum of the two numbers is: " + sum);


    }
}
