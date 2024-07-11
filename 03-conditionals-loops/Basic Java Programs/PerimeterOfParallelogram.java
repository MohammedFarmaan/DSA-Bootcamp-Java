import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Perimeter of parallelogram = 2 (b + h) ,b = base, h = height
        double b = in.nextDouble();
        double h = in.nextDouble();
        System.out.println(perimeterOfParallelogram(b,h));
//        double perimeter = 2 * (b + h);
//        System.out.println(perimeter);
    }
    static double perimeterOfParallelogram(double b, double h){
        return (2 * (b + h));
    }
}
