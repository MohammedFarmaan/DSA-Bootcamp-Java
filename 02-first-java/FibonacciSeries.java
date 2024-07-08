import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);

        int nextTerm;
        for (int i = 2; i < num; i++) {
            nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
            System.out.print(" " + nextTerm);
        }
        //        int i = 2;
//        while(i < num) {
//            nextTerm = n1 + n2;
//            n1 = n2;
//            n2 = nextTerm;
//            System.out.print(" " + nextTerm);
//            i++;
//        }

    }
}
