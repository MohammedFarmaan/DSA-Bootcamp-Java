import java.util.Scanner;

public class AreaOfIsocelesTriangle {
    public static void main(String[] args) {
//      Area of Isoceles Triangle = b/2 * sqrt( a*a - (b*b/4))
//       b = base a = sides
        Scanner input = new Scanner(System.in);

        double b = input.nextDouble();
        double a = input.nextDouble();

        double area = b/2 * Math.sqrt(a*a - (b*b/4));
        System.out.println(area);
    }
}
