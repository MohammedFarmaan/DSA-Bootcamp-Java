import java.util.Scanner;

public class FibonacciConditionalLoops {
    public static void main(String[] args) {

        int num = 10;
        System.out.println((fibonacci(num)));
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while(count < num){
//            int temp = b;
//            b = a + b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
    }

    static int fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 2;
        while(c <= n){
            int temp = b;
            b = a + b;
            a = temp;
            c++;
        }
        return a;
    }
}
