import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Total surface area of cube = 6 * a * a;

        double a = in.nextDouble();
        System.out.println(totalSurfaceAreaOfCube(a));
//        double total_surface_area = 6 * a * a;
//        System.out.println(total_surface_area);
    }
    static double totalSurfaceAreaOfCube(double a){
        return 6 * a * a;
    }
}
