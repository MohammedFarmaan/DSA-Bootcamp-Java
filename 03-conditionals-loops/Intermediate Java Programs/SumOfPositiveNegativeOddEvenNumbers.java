import java.util.Scanner;

public class SumOfPositiveNegativeOddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveNumber = 0;
        int negativeNumber = 0;
        int oddNumber = 0;
        int evenNumber = 0;

        while(true){
            int n = input.nextInt();
            if (n > 0){
                if (n % 2 == 0) {
                    evenNumber += n;
                } else{
                    oddNumber += n;
                }
                positiveNumber += n;
            } else{
                negativeNumber += n;
            }
            if (n == 0){
                break;
            }
        }
        System.out.println("positive number: " + positiveNumber);
        System.out.println("negative number: " + negativeNumber);
        System.out.println("even number: " + evenNumber);
        System.out.println("odd number: " + oddNumber);
    }
}