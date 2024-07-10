import java.util.Scanner;

public class LcmTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int hcf = num1;
        int lcm = (originalNum1 * originalNum2) / hcf;
        System.out.println(lcm);
    }
}
