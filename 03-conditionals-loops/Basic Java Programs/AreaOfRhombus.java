import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//      Area of Rhombus = (d1 * d2)/2

        double diagonal1 = input.nextDouble();
        double diagonal2 = input.nextDouble();
        System.out.println(areOfRhombus(diagonal1, diagonal2));
//        double area = (diagonal1 * diagonal2)/2;
//        System.out.println(area);
    }
    static double areOfRhombus(double diagonal1, double diagonal2){
        return ((diagonal1 * diagonal2)/2);
    }
}
