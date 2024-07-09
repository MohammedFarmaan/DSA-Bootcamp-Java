public class Subtract_ProductAndSumOfDigit {

    public static void main(String[] args) {
        int num = 234;
        int product = 1;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            product = product * rem;
            sum = sum + rem;
            num /= 10;
        }
        int result = product - sum;
        System.out.println(result);

        code();
    }
}
