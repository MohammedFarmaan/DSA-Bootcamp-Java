import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(sumDigit(n));
//        int digit = 0;
//        while(n > 0){
//            int rem = n %10;
//            digit++;
//            n = n/10;
//        }
//        System.out.println(digit);
    }
    static int sumDigit(int n){
        int c = 0;
        int sum = 0;
        while(c < n){
            int rem = n % 10;
            n /= 10;
            sum += rem;
        }
        return sum;
    }

}
