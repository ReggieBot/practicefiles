import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find odd numbers up to that number: ");
        int limit = scanner.nextInt();

        for(int number = 0; number <= limit; number++) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
        scanner.close();
    }
}
