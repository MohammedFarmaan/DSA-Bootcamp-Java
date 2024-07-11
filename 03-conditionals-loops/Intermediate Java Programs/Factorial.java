import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
//        int product = 1;
//        while(num > 0) {
//            product = product * num;
//            num--;
//        }
//        System.out.println(product);
    }
    static int factorial(int n){
        int result = 1;
        while(n > 0){
            result *= n;
            n--;
        }
        return result;
    }
}
