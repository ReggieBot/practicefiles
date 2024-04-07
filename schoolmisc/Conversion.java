import java.util.Scanner;

public class Conversion {
    @SuppressWarnings("resource")
    public static void main(String[] args){

        double fahrenheit;
        double celsius;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Fahrenheit temperature: ");
        
        fahrenheit = keyboard.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature in Celsius is: " + celsius);

        System.out.println(8 - 5 * 2.0);
        System.out.println(17.0 / 4);
        System.out.println(13 / 4);
        System.out.println(2 + 12 / 4);
        System.out.println(14 + 5 % 2 - 3);
        System.out.println(15.0 + 3 / 2);
    }
}
