import java.util.Scanner;

public class PrimeNumberFnAsmt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(isPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
    static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
