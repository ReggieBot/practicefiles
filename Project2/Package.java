package Project2;
import java.util.Scanner;

public class Package {
   
    // initialize variables
    private double length;
    private double width;
    private double height;

    private Scanner input = new Scanner(System.in);

    // constructor (noArgs)
    public Package() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    // constructor (initial/parameterized)
    public Package(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // input methods
    public void inputLength() {
        System.out.println("Please enter a length for the package: ");
        this.length = input.nextDouble();
    }

    public void inputWidth() {
        System.out.println("Please enter a width for the package: ");
        this.width = input.nextDouble();
    }

    public void inputHeight() {
        System.out.println("Please enter a height for the package: ");
        this.height = input.nextDouble();
    }

    // dimension method
    public void displayDimensions() {
        System.out.println("The dimensions of the package are: " + length + "x" + width + "x" + height);
    }

    // calculate volume method
    public double calcVolume() {
      return length * width * height;  
    }
// custom absolute value method to prevent negative shipping weights



    public static double absolute(double number) {
        if (number < 0) {
            return -number;
        }
        else {
            return number;
        }
    }
}
