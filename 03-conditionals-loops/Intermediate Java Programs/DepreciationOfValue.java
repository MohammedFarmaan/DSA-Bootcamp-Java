import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Depreciation of value formula = original price * (100 - r/100)^n,
//      r = rate of depreciation, n = number of years

        int originalValue = in.nextInt();
        int r = in.nextInt();
        int years = in.nextInt();
        double rPercent = (double) (100 - 10)/100;
        double newValue = originalValue * Math.pow(rPercent, years);
        System.out.println(newValue);
    }
}
