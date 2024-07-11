import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(isPythagoreanTriplet(a, b, c));
    }

    static boolean isPythagoreanTriplet(int a, int b, int c){
        if (a < c && b < c){
            if (a*a + b*b == c*c){
                return true;
            }
        }
        return false;
    }
}
