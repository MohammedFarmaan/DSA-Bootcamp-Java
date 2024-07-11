import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        System.out.println(isEven(number));
//        if (number % 2 == 0) {
//            System.out.println("Even Number");
//        } else {
//            System.out.println("Odd Number");
//        }
    }
    static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
}
