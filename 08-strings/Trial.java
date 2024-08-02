public class Trial {
    public static void main(String[] args) {
        int num1 = 124;
        System.out.println(isArmstrong(num1));
        // int num2 = 20;
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i) == true){
                System.out.print(i + " ");
            }
        }
    }
   static boolean isArmstrong(int n){
        int og = n;
        int sum = 0;
        int numDigit = (int) Math.log10(n) + 1;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            sum += (int) Math.pow(digit, numDigit);
        }
        return og == sum;
   }
}
