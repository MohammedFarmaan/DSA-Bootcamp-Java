import java.util.Scanner;

public class LargestOfThreeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(largest(a,b,c));
//        int max = a;
//
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(Math.max(c, Math.max(a, b)));
//        System.out.println(max);
    }
    static int largest(int num1, int num2, int num3){
        int largest = num1;
        if (num2 > largest){
            largest = num2;
        }
        if (num3 > largest){
            largest = num3;
        }
        return largest;
    }
}
