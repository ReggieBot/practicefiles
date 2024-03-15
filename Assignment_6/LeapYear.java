package Assignment_6;

public class LeapYear {
    public static void main(String[] args) {
        
        // Test cases
        System.out.println(checkLeapYear(1900));
        System.out.println(checkLeapYear(2000));
        System.out.println(checkLeapYear(2024));
    }


    // method
    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            // check for 100 year rule
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
                else {
                    return true;
                }
        }
        else {
            // not a leap year
            return false;
        }
    }  
}

// nested if statements can be pretty hard to read for me sometimes
// not sure if theres anything I can do to improve readability
// just looks like a bunch of brackets