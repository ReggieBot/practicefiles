import java.util.Scanner;

public class TwoNumbers {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the first number: ");

    double number1 = keyboard.nextDouble();
    
    System.out.println("Please enter the second number: ");

    double number2 = keyboard.nextDouble();

    if (number1 > number2) {
        System.out.println(number1 + " is the greater number");
    }
    else if (number1 < number2) {
        System.out.println(number2 + " is the greater number");
    }
    else {
        System.out.println("These are equal numbers");
    }
    }
}
    


