import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total n number: ");
        int n = in.nextInt();
        System.out.println(avg(n));
//        int count = 0;
//        double sum = 0;
//        while(n > count){
//            double number = in.nextDouble();
//            sum += number;
//            count++;
//        }
//        double average = sum/n;
//        System.out.println("Average of " + n + " numbers: " + average);
    }
    static int avg(int n){
        int sum = 0;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            int num = in.nextInt();
            sum += num;
        }
        return sum/n;
    }
}
