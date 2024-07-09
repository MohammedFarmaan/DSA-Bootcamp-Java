import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Area of Triangle = 1/2 * b * h

//      Input breadth and height
        float  base = in.nextFloat();
        float height = in.nextFloat();

        float area = (0.5f) * base * height;

        System.out.println(area);
    }
}
