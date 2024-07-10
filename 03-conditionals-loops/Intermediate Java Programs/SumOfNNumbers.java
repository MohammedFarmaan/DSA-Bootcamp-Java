import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            int num = in.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
