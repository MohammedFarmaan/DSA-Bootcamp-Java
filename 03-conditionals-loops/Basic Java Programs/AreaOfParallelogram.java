import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      Area of parallelogram = b * h

        double base = input.nextDouble();
        double height = input.nextDouble();

        double area = base * height;

        System.out.println(area);
    }
}
