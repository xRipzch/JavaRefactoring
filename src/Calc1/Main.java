package src.Calc1;

import src.Calc1.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

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
            case "+" -> calculator.add(a, b);
            case "-" -> calculator.subtract(a, b);
            case "*" -> calculator.multiply(a, b);
            case "/" -> calculator.divide(a, b);
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };

        // Display the result
        System.out.println("Result: " + result);
    }
}