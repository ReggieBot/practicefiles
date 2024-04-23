package Assignment_7;

// human class with a private variable
public class Human {
    @SuppressWarnings("unused")
    private int age;

    // constructor method
    public Human(int age) {
        this.age = age;
    }

    // method for MUTATING age value
    public void setAge(int age) {
        this.age = age;
    }

}
