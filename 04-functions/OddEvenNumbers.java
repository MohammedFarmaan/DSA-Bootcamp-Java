import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        oddOrEven(n);
    }
    static void oddOrEven(int n){
        if (n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
