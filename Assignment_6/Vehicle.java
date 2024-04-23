package Assignment_6;

// Took your adive from last assignment and tried not put my logic into the main method
public class Vehicle {
    
    public static void main(String[] args) {
        
        // class instances
        Vehicle motorcycle = new Vehicle(1, 2);
        Vehicle car = new Vehicle(5, 4);

        // test cases
        System.out.println(motorcycle.numSeats);
        System.out.println(car.numSeats);
    }

    public int numSeats;
    public int numWheels;


    // constructor
    public Vehicle(int numSeats, int numWheels) {
        this.numSeats = numSeats;
        this.numWheels = numWheels;
    }

}
