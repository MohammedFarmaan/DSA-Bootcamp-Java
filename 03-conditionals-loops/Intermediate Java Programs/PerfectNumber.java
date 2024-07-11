import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(perfect(n));
//        int sum = 0;
//        int factor = 1;
//        while(n > factor){
//            if (n % factor == 0){
//                sum += factor;
//            }
//            factor++;
//        }
//        if (n == sum) {
//            System.out.println("Perfect number");
//        } else{
//            System.out.println("Not a perfect number");
//        }
    }
    static boolean perfect(int n){
        int factor = 1;
        int sum = 0;
        while(n > factor){
            if (n % factor == 0){
                sum += factor;
            }
            factor++;
        }
        return n == sum;
    }
}
