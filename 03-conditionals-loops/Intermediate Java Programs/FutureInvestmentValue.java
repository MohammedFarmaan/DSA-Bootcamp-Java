import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Future Value (FV) = PV x pow((1 + r), n)
//        PV = Present Value
//        r = Interest Rate (%)
//        n = Number of Compounding Periods

        int pv = in.nextInt();
        double r = in.nextInt();
        int n = in.nextInt();
        System.out.println(fiv(pv,r,n));
//        r = r/100;
//
//        double fv = pv * Math.pow(1 + r, n);
//        System.out.println(fv);
    }
    static double fiv(int pv, double r, int n){
        r = r /100;
        return pv * Math.pow(1 + r, n);
    }
}
