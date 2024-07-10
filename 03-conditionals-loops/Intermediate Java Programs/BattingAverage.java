import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      batting average = runs scored / times out
        int runsScored = in.nextInt();
        int timesOut = in.nextInt();

        double average = (double) runsScored/ timesOut;
        System.out.println(average);
    }
}
