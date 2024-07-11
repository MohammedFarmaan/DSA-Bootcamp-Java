import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Power eg 2(pow(3)) = 2 * 2 * 2

        System.out.println(power(3));
//        int result = 1;
//        int n = in.nextInt();
//        int pow = in.nextInt();
//
//        for (int i = 1; i <= pow; i++){
//            result *= n;
//        }
//        System.out.println(result);
    }
    static int power(int n){
        int result = 1;

        for(int i = 1; i <= n ; i++){
            result *= n;
        }
        return result;
    }
}
