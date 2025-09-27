import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        double answer;

        switch (operation) {
            case '+':
                answer = num1 + num2;
                System.out.println("The answer is: " + answer);
                break;
            case '-':
                answer = num1 - num2;
                System.out.println("The answer is: " + answer);
                break;
            case '*':
                answer = num1 * num2;
                System.out.println("The answer is: " + answer);
                break;
            case '/':
                if (num2 != 0) {
                    answer = num1 / num2;
                    System.out.println("The answer is: " + answer);
                } else {
                    System.out.println("Error!! : Division by zero! ");
                    System.out.println("Note: the denominator should be greater than zero for division.");
                }
                break;
            default:
                System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
