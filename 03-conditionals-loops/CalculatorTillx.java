import java.util.Scanner;

public class CalculatorTillx {
    public static void main(String[] args) {
        calc();
//        Scanner in = new Scanner(System.in);
////      Take input from user till user does not press X or x
//        int ans = 0;
//
//        while(true) {
////          take the operator as input
//            System.out.println("Enter an operator: ");
//            char op = in.next().trim().charAt(0);
//
//            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
////              input two numbers
//                System.out.println("Enter two numbers: ");
//                int num1 = in.nextInt();
//                int num2 = in.nextInt();
//                if (op == '+'){
//                    ans = num1 + num2;
//                }
//                if (op == '-'){
//                    ans = num1 - num2;
//                }
//                if (op == '*'){
//                    ans = num1 * num2;
//                }
//                if (op == '/'){
////                  check if num2 = 0 (Cause zero division error)
//                    if (num2 != 0) {
//                        ans = num1 / num2;
//                    }
//                }
//                if (op == '%'){
//                    ans = num1 % num2;
//                }
////
//            } else if (op == 'x' || op == 'X'){
//                break;
//            } else {
//                System.out.println("Invalid operator!!");
//            }
//            System.out.println(ans);
//        }
    }
    static void calc(){Scanner in = new Scanner(System.in);
//      Take input from user till user does not press X or x
        int ans = 0;

        while(true) {
//          take the operator as input
            System.out.println("Enter an operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//              input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
//                  check if num2 = 0 (Cause zero division error)
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
//
            } else if (op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("Invalid operator!!");
            }
            System.out.println(ans);
        }}
}
