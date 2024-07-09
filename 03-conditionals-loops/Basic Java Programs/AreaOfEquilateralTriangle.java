import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Area of equilateral triangle = sqrt(3/4) * s*s

        double side = in.nextDouble();
        double area = (Math.sqrt(3)/4) * side * side;

        System.out.println(area);
    }
}
