import java.util.Scanner;
public class MultiplicationTable {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int x = sc.nextInt();
        while (n <= 10) {
            System.out.println(n * x);
            n = n + 1;
        }
        sc.close();
    }
}
