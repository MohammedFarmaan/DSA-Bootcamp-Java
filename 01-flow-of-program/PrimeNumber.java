public class PrimeNumber {
    public static void main (String[] args) {
        int num = 36;
        System.out.println(isPrime(num));
//        int c = 2;
//        boolean flag = true;
//        while(c < num) {
//            if (num % c == 0) {
//                flag = false;
//            }
//            c = c + 1;
//        }
//        if (!flag) {
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
        while(c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c >= n;
    }
}
