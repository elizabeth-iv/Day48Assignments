import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int numTwo = Integer.valueOf(scanner.nextLine());

        int addNumbers = numOne + numTwo;
        int subNumbers = numOne - numTwo;
        int multiNumbers = numOne * numTwo;
        double divNumbers =(double) numOne /(double) numTwo;
        int remNumbers = numOne % numTwo;

        System.out.println(numOne + " + " + numTwo + " = " + addNumbers);
        System.out.println(numOne + " - " + numTwo + " = " + subNumbers);
        System.out.println(numOne + " * " + numTwo + " = " + multiNumbers);
        System.out.println(numOne + " / " + numTwo + " = " + divNumbers);
        System.out.println(numOne + " % " + numTwo + " = " + remNumbers);





    }
}
