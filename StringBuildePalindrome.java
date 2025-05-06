import java.util.Scanner;

public class StringBuildePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);

        StringBuilder reversed = new StringBuilder(sb).reverse();

        if (sb.toString().equals(reversed.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}