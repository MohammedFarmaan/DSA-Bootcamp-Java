import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Volume of prism = l * w * h , l = length, w = width, h = height

        double l = in.nextDouble();
        double w = in.nextDouble();
        double h = in.nextDouble();

        double volume = l * w * h;
        System.out.println(volume);

    }
}
