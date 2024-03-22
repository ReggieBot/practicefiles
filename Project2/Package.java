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

    // took you advice to have setters seperate from the input methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void settHeight(double height) {
        this.height = height;
    }


    public void setDimensions(Scanner input) {
        System.out.println("Please enter a length for the package: ");
        double newLength = input.nextDouble();
        setLength(newLength);

        System.out.println("Please enter a width for the package: ");
        double newWidth = input.nextDouble();
        setWidth(newWidth);

        System.out.println("Please enter a height for the package: ");
        double newHeight = input.nextDouble();
        settHeight(newHeight);
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
