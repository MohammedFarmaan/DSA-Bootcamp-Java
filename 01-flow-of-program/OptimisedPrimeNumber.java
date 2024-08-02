
// like 2 x 18 and 18 * 2 etc;
public class OptimisedPrimeNumber {
    public static void main (String[] args) {
        int num = 5;
        System.out.println(isPrime(num));
//        int c = 2;
//
//        boolean flag = true;
//
//        while(c*c < num) {
//            if( num % 2 == 0) {
//                flag = false;
//            }
//            c = c + 1;
//        }
//        if(flag) {
//            System.out.println("Not prime");
//        } else {
//            System.out.println("Prime");
//        }
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c >= n;
    }
}
