import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int factor = 1;
        while(num >= factor){
            if (num % factor == 0){
                System.out.print(factor + " ");
            }
            factor++;
        }
    }
}
