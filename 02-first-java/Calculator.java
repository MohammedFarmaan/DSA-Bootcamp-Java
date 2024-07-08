import java.util.Scanner;
public class Calculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the operator(+, -, *, /): ");
        String operator = input.next();

        if (operator.equals("+")) {
            System.out.println("the sum  of " + num1 + " + " + num2 + ": " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("the difference  of " + num1 + " - " + num2 + ": " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("the multiplication is of " + num1 + " * " + num2 + ": " + (num1 * num2));
        } else {
            System.out.println("the division is of " + num1 + '/' + num2 + ": " + (num1 / num2));
        }
    }
}
