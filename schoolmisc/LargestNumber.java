import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
        double largestNumber;

        System.out.println("Please enter the first number: ");
        double number1 = keyboard.nextDouble();
        
        System.out.println("Please enter the second number: ");
        double number2 = keyboard.nextDouble();

        System.out.println("Please enter the third number: ");
        double number3 = keyboard.nextDouble();

        if (number1 >= number2 && number1 >= number3) {
            largestNumber = number1;
        }
        else if (number2 >= number1 && number2 >= number3) {
            largestNumber = number2;
        }
        else {
            largestNumber = number3;
        }

        System.out.println(largestNumber + " is the largest of the three numbers");
    }
}
