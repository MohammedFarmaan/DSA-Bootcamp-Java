import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(isPrime(num1));
        for(int i = num1; i <= num2; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n) {
    if (n <= 1){
        return false;
    }
    int c = 2;
    while(c*c <= n){
        if (n % c == 0){
            return false;
        }
        c++;
    }
    return c * c >= n;
    }
}

