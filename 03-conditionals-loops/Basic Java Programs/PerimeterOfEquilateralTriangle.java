import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Perimeter of equilateral triangle = 3a
//      a denotes sides

        double a = in.nextDouble();
        System.out.println(perimeterOfEquilateralTriangle(a));
//        double perimeter = 3 * a;

//        System.out.println(perimeter);
    }
    static double perimeterOfEquilateralTriangle(double a){
        return (3 * a);
    }
}
