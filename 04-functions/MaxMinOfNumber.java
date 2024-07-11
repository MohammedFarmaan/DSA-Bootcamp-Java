import java.util.Scanner;

public class MaxMinOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = maxNumber(num1,num2,num3);
        int min = minNumber(num1,num2,num3);
        System.out.println("max number: " + max);
        System.out.print("min number: " + min);
    }

    static int maxNumber(int num1, int num2, int num3){
        int max = num1;

        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        return max;
    }

    static int minNumber(int num1, int num2, int num3){
        int min = num1;
        if(num2 < min){
            min = num2;
        }
        if(num3 < min){
            min = num3;
        }
        return min;
    }
}
