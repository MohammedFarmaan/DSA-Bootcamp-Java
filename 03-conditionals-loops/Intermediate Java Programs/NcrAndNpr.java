import java.util.Scanner;

public class NcrAndNpr {

    public static int fact(int n){
        int result = 1;
        while(n > 0){
            result *= n;
            n--;
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Ncr = n! / r! * (n - r)!
//      Npr = n! / (n - r)!

        int n = in.nextInt();
        int r = in.nextInt();
        ncrNpr(n, r);
//        int ncr = fact(n) / (fact(r) * fact(n - r));
//        int npr = fact(n) / fact(n - r);
//
//        System.out.println("ncr " + ncr);
//        System.out.println("npr " + npr);
    }
    static void ncrNpr(int n, int r){
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);

        System.out.println("ncr " + ncr);
        System.out.println("npr " + npr);
    }

    static int factorial(int num){
        int result = 1;
        while (num > 0){
            result *= num;
            num--;
        }
        return result;
    }
}
