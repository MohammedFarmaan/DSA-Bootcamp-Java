import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Volume of cone = 1/3 * PI r*r * h
        double PI = 3.14;
        double r = in.nextDouble();
        double h = in.nextDouble();

        double volume = (PI * r * r) * h * 1/3;
        System.out.println(volume);
    }
}
