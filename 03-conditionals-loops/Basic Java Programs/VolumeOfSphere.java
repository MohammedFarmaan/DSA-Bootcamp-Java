import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Volume of sphere = 4/3 * PI * r*r*r

        double PI = 3.14;
        double r = in.nextDouble();
        System.out.println(r);
//        double volume = PI * r*r*r * 4/3;
//
//        System.out.println(volume);
    }
    static double volOfSphere(double r){
        return Math.PI * r * r * r * 4/3;
    }
}
