import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while(number != 0) {
            int digit = number % 10;
//          Casting sum to int because it is type converted to double and taking memory
            sum += (int) Math.pow(digit, numDigits);
            number = number / 10;
        }

        return originalNumber == sum;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            if(isArmstrong(i)) {
                System.out.println(i +" is an Armstrong number");
            }
        }
        input.close();
    }
}
