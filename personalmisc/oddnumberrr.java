// Program to find odd numbers given a limit of values
// Reggie Brown
// May 14, 2024

package personalmisc;
import java.util.Scanner;

public class oddnumberrr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the odd number program homie!");
        System.out.println("What is the value limit?: ");
        int limit = scanner.nextInt();

        for (int i = 0; i <= limit; i ++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}