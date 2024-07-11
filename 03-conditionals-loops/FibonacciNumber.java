import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(fibonacci(n));
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while(count <= n) {
//            int temp = b;
//            b = a + b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
    }

    static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 2;
        while (c <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            c++;
        }
        return a;
    }
}
