import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Perimeter of a circle = 2 * PI * r

//        double PI = 3.14;
        double r = in.nextDouble();
        System.out.println(perimeterOfCircle(r));
//        double perimeter = 2 * PI * r;
//        System.out.println(perimeter);
    }
    static double perimeterOfCircle(double r){
        return (2 * Math.PI * r);
    }
}
