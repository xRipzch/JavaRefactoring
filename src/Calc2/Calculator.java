package src.Calc2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {


    public void run() {
        Calculator();
    }

    Scanner input = new Scanner(System.in);
    double num1 = 0;
    double num2 = 0;
    char operator;
    double result;

    public void Calculator() {
        while (true) {
            // Display menu
            System.out.println("Velkommen til regnemaskinen");
            System.out.println(" + for addition ");
            System.out.println(" - for subtraction");
            System.out.println(" * for multiplication");
            System.out.println(" / for division");
            System.out.println(" q for quit");
            operator = input.next().charAt(0);

            if (operator == 'q') break;

            // Get first number
            num1 = inputDouble();

            // Get second number
            System.out.print("Write second number: ");
            num2 = input.nextDouble();

            // Perform calculation based on operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator");
                    input.nextLine();
                    continue;
            }

            // Display result
            System.out.println("RESULT = " + result);
        }
    }

    // Method to get a valid double input from the user
    static double inputDouble() {
        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        double num = 0;

        do {
            try {
                System.out.print("Write first number: ");
                num = input.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again");
                input.next(); // Clear the invalid input
            }
        } while (!validInput);

        return num;
    }
}
