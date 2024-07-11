import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Volume of cylinder = PI * r * r * h
        double PI = 3.14;
        double r = in.nextDouble();
        double h = in.nextDouble();
        System.out.println(volumeOfCylinder(r,h));
//        double volume = (PI * r *  r) * h;
//        System.out.println(volume);
    }
    static double volumeOfCylinder(double r, double h){
        return (Math.PI * r * r) * h;
    }
}
