package personalmisc;
import java.util.Scanner;
public class odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the odd number program!");
        System.out.println("What is the number range?: ");
        int limit = scanner.nextInt();
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }    
}
