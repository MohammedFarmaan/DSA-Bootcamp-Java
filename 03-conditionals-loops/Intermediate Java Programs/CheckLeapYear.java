import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("Leap year");
                } else {
                    System.out.println("not Leap year");
                }
            }else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("not Leap year");
        }
    }
}
