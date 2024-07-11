public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n));
//        int ans = 0;
//        while(n > 0) {
//            int rem = n % 10;
//            n /= 10;
//            ans = ans * 10 + rem;
//        }
//        System.out.println(ans);
    }
    static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
}
