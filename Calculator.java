
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        // Input: Second number
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        // Input: Operation choice
        System.out.println("Choose an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        int choice = scanner.nextInt();

        // Perform calculation based on the choice
        double result = 0;
        boolean validOperation = true;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result of " + a + " + " + b + " = " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result of " + a + " - " + b + " = " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result of " + a + " * " + b + " = " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result of " + a + " / " + b + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result of " + a + " % " + b + " = " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
                validOperation = false;
                break;
        }

        // Close the scanner
        scanner.close();
    }
}

