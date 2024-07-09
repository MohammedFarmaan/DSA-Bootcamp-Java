import java.util.Scanner;

public class PrintSumTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int number = in.nextInt();
            if (number != 0){
                sum += number;
            } else if (number == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
