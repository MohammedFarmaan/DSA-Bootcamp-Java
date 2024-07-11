import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      batting average = runs scored / times out
        int runsScored = in.nextInt();
        int timesOut = in.nextInt();
        System.out.println(batAvg(runsScored,timesOut));
//        double average = (double) runsScored/ timesOut;
//        System.out.println(average);
    }
    static int batAvg(int rs, int to){
        return (int) rs/to;
    }
}
