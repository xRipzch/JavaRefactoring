package src.Calc3;

/**
 * A class to perform basic arithmetic operations on two values.
 */
public class Calc3 {

    // Fields to store the first and second values for calculations
    private double firstValue;
    private double secondValue;

    // Constructor to initialize the first value
    public Calc3(double firstValue) {
        this.firstValue = firstValue;
    }

    // Constructor to initialize both the first and second values
    public Calc3(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    // Getter for the first value
    public double getFirstValue() {
        return firstValue;
    }

    // Setter for the first value
    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    // Getter for the second value
    public double getSecondValue() {
        return secondValue;
    }

    // Setter for the second value
    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    // Method to add the first and second values
    public double add() {
        return firstValue + secondValue;
    }

    // Method to subtract the second value from the first value
    public double subtract() {
        return firstValue - secondValue;
    }

    // Method to multiply the first and second values
    public double multiply() {
        return firstValue * secondValue;
    }

    // Method to divide the first value by the second value
    // Throws an IllegalArgumentException if the second value is zero
    public double divide() {
        if (secondValue == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return firstValue / secondValue;
    }
}