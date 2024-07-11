import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(fibonacci(num));
//        int n1 = 0;
//        int n2 = 1;
//        System.out.print(n1 + " " + n2);
//
//        int nextTerm;
//        for (int i = 2; i < num; i++) {
//            nextTerm = n1 + n2;
//            n1 = n2;
//            n2 = nextTerm;
//            System.out.print(" " + nextTerm);
//        }
        //        int i = 2;
//        while(i < num) {
//            nextTerm = n1 + n2;
//            n1 = n2;
//            n2 = nextTerm;
//            System.out.print(" " + nextTerm);
//            i++;
//        }
    }

    static int fibonacci(int n){
        if (n <= 1){
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 2;
        while(c <= n){
            int temp = b;
            b = a + b;
            a = temp;
            c++;
        }
        return a;
    }
}
