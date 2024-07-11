import java.util.Scanner;
public class LargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println(findLargest(num1,num2));
//        if (num1 < num2) {
//            System.out.println("Smallest number is" + num1);
//        } else {
//            System.out.println("Smallest number is " + num2);
//        }
    }
    static int findLargest(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }
}
