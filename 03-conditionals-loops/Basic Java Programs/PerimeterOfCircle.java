import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Perimeter of a circle = 2 * PI * r

        double PI = 3.14;
        double r = in.nextDouble();

        double perimeter = 2 * PI * r;
        System.out.println(perimeter);
    }
}
