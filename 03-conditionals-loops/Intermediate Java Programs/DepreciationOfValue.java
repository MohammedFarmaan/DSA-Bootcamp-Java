import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Depreciation of value formula = original price * (100 - r/100)^n,
//      r = rate of depreciation, n = number of years

        int originalValue = in.nextInt();
        int r = in.nextInt();
        int years = in.nextInt();
        System.out.println(depValue(originalValue,r,years));
//        double rPercent = (double) (100 - 10)/100;
//        double newValue = originalValue * Math.pow(rPercent, years);
//        System.out.println(newValue);
    }
    static double depValue(int ov, int r, int y){
        double rp = (double) (100-10) /100;
        return ov * Math.pow(rp, y);
    }
}
