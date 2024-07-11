import java.util.Scanner;
public class MultiplicationTable {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 1;
//        int x = sc.nextInt();
//        while (n <= 10) {
//            System.out.println(n * x);
//            n = n + 1;
//        }
        mutiplicationTable(2,10);
        sc.close();
    }
    static void mutiplicationTable(int num, int n){
        for(int i = 1; i <= n; i++){
            int product = i * num;
            System.out.println(num + " x " + i + " = " +product);
        }
    }
}
