import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int originalNumber = n;
        int sum = 0;
        int numDigit = String.valueOf(n).length();
        while(n > 0){
            int rem = n % 10;
            sum += Math.pow(rem, numDigit);
            n /= 10;
        }
        if (originalNumber == sum){
            System.out.println("Armstrong number");
        } else {
            System.out.println("not armstrong number");
        }
    }
}
