import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("String length: " + input.length());
        System.out.println("String to uppercase: " + input.toUpperCase());
        System.out.println("String to lowercase: " + input.toLowerCase());
        System.out.println("First Character of String " + input + " is: " + input.charAt(0));
        System.out.println("Last Character of String " + input + " is: " + input.charAt(input.length() - 1));
        System.out.println("Substring from the second character to the fifth, " + input + " is: " + input.substring(1, 5));
        scanner.close();
    }
    
}