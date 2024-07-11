public class Subtract_ProductAndSumOfDigit {

    public static void main(String[] args) {
        int num = 234;
        System.out.println(subProdOfDigit(num));
//        int product = 1;
//        int sum = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            product = product * rem;
//            sum = sum + rem;
//            num /= 10;
//        }
//        int result = product - sum;
//        System.out.println(result);
    }

    static int subProdOfDigit(int n){
        int sum = 0;
        int product = 1;
        while (n > 0){
            int rem = n % 10;
            n /= 10;
            sum += rem;
            product *= rem;
        }
        return product - sum;
    }
}
