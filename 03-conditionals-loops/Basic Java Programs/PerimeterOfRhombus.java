import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Perimeter of rhombus = 4a, a = sides

        double a = in.nextDouble();
        double perimeter = 4 * a;
        System.out.println(perimeter);

    }
}
