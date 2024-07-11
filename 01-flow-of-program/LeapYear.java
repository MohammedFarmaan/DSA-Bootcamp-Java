import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println("LeapYear");
//                } else {
//                    System.out.println("Not LeapYear");
//                }
//            } else {
//                System.out.println("LeapYear");
//            }
//        } else {
//            System.out.println("Not LeapYear");
//        }
        System.out.println(isLeapYear(year));
        sc.close();
    }

    static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    }
