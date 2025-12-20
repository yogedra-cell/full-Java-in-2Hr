import java.util.Scanner;

public class ArithmeticOperationsF {
    public static void performOperations(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);

        int sub = a - b;
        System.out.println("The difference is: " + sub);

        int mul = a * b;
        System.out.println("The product is: " + mul);

        // Check for division by zero
        if (b != 0) {
            int div = a / b;
            System.out.println("The division is: " + div);

            int mod = a % b;
            System.out.println("The remainder is: " + mod);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        performOperations(num1, num2);

        sc.close();
    }
}