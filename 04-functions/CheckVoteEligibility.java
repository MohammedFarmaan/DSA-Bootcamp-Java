import java.util.Scanner;

public class CheckVoteEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(checkEligibility(age));
    }
    static boolean checkEligibility(int age){
        if (age >= 18){
            return true;
        }
        return false;
    }
}
