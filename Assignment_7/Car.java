package Assignment_7;

// Car class with a private variable
public class Car {
    private int horsepower;


// constructor method
    public Car(int horsepower) {
    this.horsepower = horsepower;
    }


// Method for ACCESSING horsepower value
    public int getHorsepower() {
    return horsepower;
    }

    
    public static void main(String[] args) {
        Car car1 = new Car(150);
    }
}

