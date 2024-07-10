import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total n number: ");
        int n = in.nextInt();
        int count = 0;
        double sum = 0;
        while(n > count){
            double number = in.nextDouble();
            sum += number;
            count++;
        }
        double average = sum/n;
        System.out.println("Average of " + n + " numbers: " + average);
    }
}
