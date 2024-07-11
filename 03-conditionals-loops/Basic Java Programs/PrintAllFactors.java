import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        factor(num);
//        int factor = 1;
//        while (num >= factor) {
//            if (num % factor == 0) {
//                System.out.print(factor + " ");
//            }
//            factor++;
//        }
    }
    static void factor(int n){
        int factor = 1;
        while (n >= factor){
            if (n % factor == 0){
                System.out.println(factor + " ");
            }
            factor++;
        }
    }
}
