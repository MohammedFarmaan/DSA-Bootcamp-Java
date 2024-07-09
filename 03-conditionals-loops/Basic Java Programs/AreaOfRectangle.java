import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      Area of rectangle = l * b

        float length = input.nextFloat();
        float breadth = input.nextFloat();

        float  area = length * breadth;
        System.out.println(area);
    }
}
