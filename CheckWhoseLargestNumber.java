import java.util.Scanner;

public class CheckWhoseLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The first number is the largest.");
        } else if(secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The second number is the largest.");
        } else if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The third number is the largest.");
        } else {
            System.out.println("All numbers are equal");
        }
        scanner.close();
    }
}
