import java.util.Scanner;

public class SurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      surface area of cylinder = 2 * PI * r * h

        double PI = 3.14;
        double r = in.nextDouble();
        double h = in.nextDouble();

        double surface_area = 2 * PI * r * h;

        System.out.println(surface_area);
    }
}