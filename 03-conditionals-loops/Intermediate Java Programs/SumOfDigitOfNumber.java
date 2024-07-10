import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int digit = 0;
        while(n > 0){
            int rem = n %10;
            digit++;
            n = n/10;
        }
        System.out.println(digit);
    }
}
