import java.util.Scanner;

public class HcfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      10, 50, hcf = 10
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(hcf(num1,num2));
//        while(num2 != 0){
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//        }
//        int hcf = num1;
//        System.out.println(hcf);
    }
    static int hcf(int num1, int num2){
        while(num2 < 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

}