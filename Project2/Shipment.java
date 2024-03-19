package Project2;

public class Shipment {
    public static void main(String[] args) {

        Package package1 = new Package();
        Package package2 = new Package();

        // input dimensions for both packages (1, 2) using input methods from package class
        package1.inputLength();
        package1.inputWidth();
        package1.inputHeight();

        package2.inputLength();
        package2.inputWidth();
        package2.inputHeight();
    }
}
