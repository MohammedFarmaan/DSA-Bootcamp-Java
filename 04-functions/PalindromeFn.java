import java.util.Scanner;

public class PalindromeFn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isPalildrome(n));
    }
    static boolean isPalildrome(int n){
        int original = n;
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            ans  = ans * 10 + rem;
        }
        return original == ans;
    }
}
