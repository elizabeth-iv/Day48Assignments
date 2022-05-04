import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");
        int grade = Integer.valueOf(scanner.nextLine());

        if (grade <= 59) {
            System.out.println("Your Grade is an F for Failure");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Your Grade is D for Donkey");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Your Grade is C for Close Enough ");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Your Grade is B for Brilliant ");
        } else {
            System.out.println("Your Grade is A for Amazing");
        }
    }
}
