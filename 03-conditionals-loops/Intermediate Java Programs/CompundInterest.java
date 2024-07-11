import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Compound interest = p * pow((1 + (r/100)),t)

        int p = in.nextInt();
        double r = in.nextDouble();
        int t = in.nextInt();
        System.out.println(ci(p,r,t));
//        double CI = p * (Math.pow(1+(r/100), t));
//        System.out.println(CI);

    }
    static double ci(int p, double r, int t){
        return (p*t*r) / 100;
    }
}
