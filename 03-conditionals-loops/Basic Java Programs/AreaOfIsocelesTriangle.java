import java.util.Scanner;

public class AreaOfIsocelesTriangle {
    public static void main(String[] args) {
//      Area of Isoceles Triangle = b/2 * sqrt( a*a - (b*b/4))
//       b = base a = sides
        Scanner input = new Scanner(System.in);

        double b = input.nextDouble();
        double a = input.nextDouble();
        System.out.println(areaOfIsocelesTriangle(a,b));
//        double area = b/2 * Math.sqrt(a*a - (b*b/4));
//        System.out.println(area);
    }
    static double areaOfIsocelesTriangle(double a, double b){
        return ((b/2) * (Math.sqrt(((a*a) - ((b*b)/4)))));
    }
}
