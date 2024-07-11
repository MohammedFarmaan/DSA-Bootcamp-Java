import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sum(3));
//        int n = in.nextInt();
//        int sum = 0;
//        for (int i = 0; i < n; i++){
//            int num = in.nextInt();
//            sum += num;
//        }
//        System.out.println(sum);
    }
    static int sum(int n){
        int sum = 0;
        int c = 0;
        Scanner in = new Scanner(System.in);
        while (c < n){
            int num = in.nextInt();
            c++;
            sum += num;
        }
        return sum;
    }
}
