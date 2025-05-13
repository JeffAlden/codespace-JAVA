import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        if (num2 != 0) {
            System.out.println("Division: " + divide(num1, num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
        scanner.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
}
