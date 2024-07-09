import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Perimeter of equilateral triangle = 3a
//      a denotes sides

        double a = in.nextDouble();
        double perimeter = 3 * a;

        System.out.println(perimeter);
    }
}
