// program to find odd numbers from a user-given value
// Reggie Brown
// May 15, 2024

package personalmisc;
import java.util.Scanner;

public class oddnumberrr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get user input for limit value
        System.out.println("Welcome to the odd number program");
        System.out.println("What is the limit?");
        int limit = scanner.nextInt();

        // loop to find odd number
        for (int i = 0; i <= limit; i ++) {
            if (i % 2 == 1) {
                System.out.println(i);

            }
        }
        scanner.close();
    } 
}