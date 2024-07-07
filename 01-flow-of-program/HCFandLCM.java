import java.util.Scanner;
public class HCFandLCM {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int n1 = num1;
        int n2 = num2;

        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        int HCF = n1;
        int LCM = (num1 * num2) / HCF;

        System.out.println(HCF);
        System.out.println(LCM);
        
        sc.close();
    }
}
