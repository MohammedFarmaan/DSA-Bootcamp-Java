import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int product = 1;
        while(num > 0) {
            product = product * num;
            num--;
        }
        System.out.println(product);
    }
}
