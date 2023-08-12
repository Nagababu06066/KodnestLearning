import java.util.Scanner;

public class CalculatorOverlodding {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorOverlodding calculator = new CalculatorOverlodding();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        try {
            int result = calculator.performOperation(num1, num2, operator);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public int performOperation(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

}
