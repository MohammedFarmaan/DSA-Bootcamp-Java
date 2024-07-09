import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Volume of pyramid = 1/3 * l * b * h, l = length, b = base, h = height

        double l = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();

        double volume = l * b * h * 1/3;

        System.out.println(volume);
    }
}
