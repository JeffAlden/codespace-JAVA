import java.util.Scanner;

public class ScoreToGrade_F_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (between 0 - 100) : ");
        int grade = scanner.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Not a valid number");
        } else {
            if (grade >= 90)
                System.out.println(grade + " You got A grade");
            else if (grade >= 80 && grade <= 89)
                System.out.println(grade + " You got B grade");
            else if (grade >= 70 && grade <= 79)
                System.out.println(grade + " You got C grade");
            else if (grade >= 60 && grade <= 69)
                System.out.println(grade + " You got D grade");
            else if (grade < 60)
                System.out.println(grade + " You got F grade");
        }
        scanner.close();
    }
}
