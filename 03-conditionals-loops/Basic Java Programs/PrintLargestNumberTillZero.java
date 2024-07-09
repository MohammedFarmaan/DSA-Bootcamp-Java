import java.util.Scanner;

public class PrintLargestNumberTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largest = 0;
        while(true){
            int number = in.nextInt();
            if (number > largest) {
                largest = number;
            } else if (number == 0){
                break;
            }
        }
        System.out.println(largest);
    }
}
