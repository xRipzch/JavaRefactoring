package src.Calc3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A utility class to perform basic arithmetic operations.
 */
public class Calculator {

    // Method to add two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract the second number from the first number
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide the first number by the second number
    // Throws an IllegalArgumentException if the second number is zero
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Method to run the calculator and handle user input
    public void run() {

        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for the first number
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();

            // Prompt user for the second number
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            // Prompt user to choose an operator
            System.out.print("Choose operator (+, -, *, /): ");
            String operator = scanner.next();

            // Perform the operation based on the chosen operator
            double result = switch (operator) {
                case "+" -> add(a, b);
                case "-" -> subtract(a, b);
                case "*" -> multiply(a, b);
                case "/" -> divide(a, b);
                default -> throw new IllegalArgumentException("Invalid operator: " + operator);
            };

            // Display the result
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}