import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Volume of pyramid = 1/3 * l * b * h, l = length, b = base, h = height

        double l = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();
        System.out.println(volOfPyramid(l,b,h));
//        double volume = l * b * h * 1/3;
//
//        System.out.println(volume);
    }
    static double volOfPyramid(double l, double b, double h){
        return l * b * h * 1/3;
    }
}
