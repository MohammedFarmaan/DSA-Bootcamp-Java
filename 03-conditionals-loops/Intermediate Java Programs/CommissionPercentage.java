import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Commission formula = total_sales * commission percent /100

        double total_sales = in.nextDouble();
        double commission_percent = in.nextDouble();

        System.out.println(comPercent(total_sales, commission_percent));
//        double commission = total_sales * commission_percent/100;
//        System.out.println(commission);
    }
    static double comPercent(double ts, double cp){
        return ts * cp/100;
    }
}