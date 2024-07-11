import java.util.Scanner;

public class SumOfPositiveNegativeOddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        op();
//        int positiveNumber = 0;
//        int negativeNumber = 0;
//        int oddNumber = 0;
//        int evenNumber = 0;
//
//        while(true){
//            int n = input.nextInt();
//            if (n > 0){
//                if (n % 2 == 0) {
//                    evenNumber += n;
//                } else{
//                    oddNumber += n;
//                }
//                positiveNumber += n;
//            } else{
//                negativeNumber += n;
//            }
//            if (n == 0){
//                break;
//            }
//        }
//        System.out.println("positive number: " + positiveNumber);
//        System.out.println("negative number: " + negativeNumber);
//        System.out.println("even number: " + evenNumber);
//        System.out.println("odd number: " + oddNumber);
    }
    static void op(){
        Scanner in = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        while(true){
            int num = in.nextInt();
            if(num > 0){
                if (num % 2 == 0){
                    even += num;
                } else {
                    odd += odd;
                }
                pos += num;
            }
            else{
                neg += num;
            }
            if (num == 0){
                break;
            }
        }
        System.out.println(pos);
        System.out.println(neg);
        System.out.println(odd);
        System.out.println(even);
    }
}