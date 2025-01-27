import java.util.Scanner;

class Operation {

    public void performOperation(double num1, double num2) {

    }
}

class Addition extends Operation {
    public void performOperation(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Addition Result: " + result);
    }
}

class Subtraction extends Operation {

    public void performOperation(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    }
}

class Multiplication extends Operation {

    public void performOperation(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Multiplication Result: " + result);
    }
}

class Division extends Operation {

    public void performOperation(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Error! Division by zero is not allowed.");
        }
    }
}

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.print("Enter your operation choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        Operation operation = null;

        if (choice == 1) {
            operation = new Addition();
        } else if (choice == 2) {
            operation = new Subtraction();
        } else if (choice == 3) {
            operation = new Multiplication();
        } else if (choice == 4) {
            operation = new Division();
        }

        if (operation != null) {
            operation.performOperation(num1, num2);
        }

        scanner.close();
    }
}