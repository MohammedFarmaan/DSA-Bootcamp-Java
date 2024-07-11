import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      Area of parallelogram = b * h

        double base = input.nextDouble();
        double height = input.nextDouble();
        System.out.println(areaOfParallelogram(base,height));
//        double area = base * height;
//
//        System.out.println(area);
    }
    static double areaOfParallelogram(double b, double h){
        return b * h;
    }
}
