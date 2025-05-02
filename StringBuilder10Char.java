import java.util.Scanner;

public class StringBuilder10Char {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();

        if (input.length() < 10) {
            System.out.println("The string must be at least 10 characters long.");
            scanner.close();
            return;
        }

        StringBuilder sb = new StringBuilder(input);

        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(sb.length()- 1));
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.substring(3, 6));

        sb.append("123");
        System.out.println(sb);

        sb.insert(4, "xyz");
        System.out.println(sb);

        sb.delete(2, 4);        
        System.out.println(sb);

        if (sb.length() > 8) {
          sb.deleteCharAt(8);
          System.out.println("After deleting char at index 8: " + sb);
      } else {
          System.out.println("Cannot delete char at index 8 (out of bounds).");
      }
      sb.reverse();
      System.out.println("Reversed string: " + sb);
        scanner.close();
    }
}