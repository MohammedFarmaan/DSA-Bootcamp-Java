import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Circle area formula = PI * r * r

//      input radius
        float PI = 3.14f;

        float radius = in.nextFloat();

        float area = PI * radius * radius;
        System.out.println(area);
    }
}
