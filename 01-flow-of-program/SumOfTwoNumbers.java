import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(sum(num1, num2));

//        int sum = num1 + num2;
//
//        System.out.println(sum);
        
        sc.close();
    }
    static int sum(int num1, int num2){
        return num1 + num2;
    }
}
