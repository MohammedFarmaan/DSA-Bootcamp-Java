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

//      Created a function for hcf and lcm
        System.out.println(findHcf(num1,num2));
        System.out.println(findLcm(num1,num2));
        sc.close();
    }

    static int findHcf(int num1, int num2){
        while(num2 > 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    static int findLcm(int num1, int num2){
        int orginalNum1 = num1;
        int originalNum2 = num2;

        while(num2 > 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int hcf = num1;
        int lcm = (orginalNum1 * originalNum2) / hcf;
        return lcm;
    }
}
