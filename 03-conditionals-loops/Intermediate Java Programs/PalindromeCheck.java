import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(palindrome(n));
//        int originalNumber = n;
//        int reverse = 0;
//        while(n > 0){
//            int rem = n % 10;
//            reverse  = reverse * 10 + rem;
//            n /= 10;
//        }
//        if (originalNumber == reverse){
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not palindrome");
//        }
    }
    static boolean palindrome(int n){
        int original = n;
        int result = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            result = result * 10 + rem;
        }
        return original == result;
    }
}
