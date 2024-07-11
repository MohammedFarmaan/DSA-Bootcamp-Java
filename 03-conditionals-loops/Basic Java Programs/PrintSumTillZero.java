import java.util.Scanner;

public class PrintSumTillZero {
    public static void main(String[] args) {
        printSum();
//        Scanner in = new Scanner(System.in);
//        int sum = 0;
//        while(true){
//            int number = in.nextInt();
//            if (number != 0){
//                sum += number;
//            } else if (number == 0){
//                break;
//            }
//        }
//        System.out.println(sum);
    }
    static void printSum(){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int num = in.nextInt();
            if (num > 0){
                sum+= num;
            }
            if (num == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
