import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        System.out.println("Area of the circle: " + areaOfCircle(radius));
        System.out.println("Circumference of the circle: "+ circumferenceOfCircle(radius));
    }
    static float areaOfCircle(int r){
        float PI = 3.14f;
        return PI * r * r;
    }
    static float circumferenceOfCircle(int r){
        float PI = 3.14f;
        return 2 * PI * r;
    }
}
