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

        int ncr = fact(n) / (fact(r) * fact(n - r));
        int npr = fact(n) / fact(n - r);

        System.out.println("ncr " + ncr);
        System.out.println("npr " + npr);
    }
}
