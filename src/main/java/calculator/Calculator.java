package calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Calculator.class.getName());
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the first number");
        double num1 = scanner.nextDouble();
        log.info("Enter the second number");
        double num2 = scanner.nextDouble();
        double addResult = add(num1, num2);
        log.info(()->"The sum is: " + addResult);
        double subResult = subtract(num1, num2);
        log.info(()->"The difference is: " + subResult);
        double mulResult = multiply(num1, num2);
        log.info(()->"The product is: " + mulResult);
        try {
            double divResult = divide(num1, num2);
            log.info(()->"The quotient is: " + divResult);
        } catch (IllegalArgumentException e) {
            log.severe(e.getMessage());
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}
