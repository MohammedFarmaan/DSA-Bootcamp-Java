import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Perimeter of rectangle = 2 * (l + b), l = length, b = breadth

        double l = in.nextDouble();
        double b = in.nextDouble();
        System.out.println(perimeterOfRectangle(l, b));
//        double perimeter = 2 * (l + b);
//        System.out.println(perimeter);
    }

    static double perimeterOfRectangle(double l, double b){
        return (2 * (l + b));
    }
}
