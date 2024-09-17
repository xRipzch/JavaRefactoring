package src.Calc1;

public class Calculator {

    // Method to add two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract the second number from the first
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide the first number by the second
    // Throws an exception if the second number is zero
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}