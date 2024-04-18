package conc;
import java.util.Scanner;


public class conc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        int num1, num2, sum;
        System.out.println("Please enter the first number: ");
        num1 = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
