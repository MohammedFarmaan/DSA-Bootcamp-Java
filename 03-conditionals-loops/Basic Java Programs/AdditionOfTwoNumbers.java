import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

//        int result = num1 + num2;
//        System.out.println("Addition of " + num1 + " + " + num2 + " = " + result);
        System.out.println(add(num1, num2));
    }
    static int add(int num1, int num2){
        return num1 + num2;
    }
}
