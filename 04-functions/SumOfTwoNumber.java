import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println(sum(num1,num2, num3));
    }
    static int sum(int num1, int num2){
        return num1 + num2;
    }
//  Function overloading
//  it can have same function name but not same number of arguments
    static  int sum(int num1, int num2, int num3){
        return num1 + num2 + num2;
    }
}
