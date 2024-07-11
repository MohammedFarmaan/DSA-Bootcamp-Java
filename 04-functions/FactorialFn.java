import java.util.Scanner;

public class FactorialFn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Factorial(n));
    }
    static int Factorial(int n){
        if(n <= 1){
            return 1;
        }
        int a = 2;
        int product = 1;
        while(a <= n){
            product *= a;
            a++;
        }
        return product;
    }
}
