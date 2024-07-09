import java.util.Scanner;

public class FibonacciConditionalLoops {
    public static void main(String[] args) {

        int num = 10;
        int a = 0;
        int b = 1;
        int count = 2;
        while(count < num){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
