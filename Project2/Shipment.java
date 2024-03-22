package Project2;
import java.util.Scanner;

public class Shipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // dimensions for package 1
        System.out.println("Please enter dimensions for Package #1: ");
        Package package1 = new Package();
        package1.setDimensions(scanner);


        // dimensions for package 2
        System.out.println("Please enter dimensions for Package #2: ");
        Package package2 = new Package();
        package2.setDimensions(scanner);

         // caclulate volume/cost
        double volume1 = package1.calcVolume();
        double volume2 = package2.calcVolume();
        double cost1 = calcCost(volume1);
        double cost2 = calcCost(volume2);

        // get cost comparison
        double costDiff = package1.absolute(cost1 = cost2);
        String costComp = costCompare(cost1, cost2);


        // display costs and volumes
        System.out.println("The dimensions for package 1 are: ");
        package1.displayDimensions();
        System.out.println("The dimensions for package 2 are: ");
        package2.displayDimensions();
        System.out.println("The cost comparisons for the package are: ");
        System.out.println("Package 1 Volume = " + volume1);
        System.out.println("Package 1 Cost = " + cost1);
        System.out.println ("Package 2 Volume = " + volume2);
        System.out.println("Package 2 Cost = " + cost2);

        // get and display cost difference
        // base case
        if (cost1 == cost2) {
            System.out.println("Both packages cost the same");
        } else {
            String moreExpensive;
            String lessExpensive;

            if (cost1 > cost2) {
                moreExpensive = "1";
                lessExpensive = "2";
            } else {
                moreExpensive = "2";
                lessExpensive = "1";

            }

            System.out.println("Package " + moreExpensive + " is " + costComp + " Than package " + lessExpensive + "by $" + costDiff);
        }
    }


    public static double calcCost(double volume) {
        double startPrice = 3.0;
        double cost = startPrice;

        // for loop to increment cost based on volume of package 
        for (int i = 1; i <= (int)volume; i++) {
            cost += 1.0;
        } 
        return cost;
    }

    // cost compare method
    public static String costCompare(double cost1, double cost2) {
        double costRatio = Math.min(cost1, cost2) / Math.max(cost1, cost2); // calculates ratio of smaller cost to larger cost
        if (costRatio < 0.5) {
            return "slightly more than";
        } else if (costRatio < 0.75) {
            return "twice";
        } else if (costRatio < 0.8) {
            return "triple";
        } else if (costRatio < 0.9) {
            return "quadruple";
        } else {
            return (int)(Math.max(cost1, cost2) / Math.min(cost1, cost2)) + "x"; // calculates the 'n' times greater than if none of the above conditions are met
        }

    }
}
