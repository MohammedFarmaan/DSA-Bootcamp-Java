public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
//      Distance between two points D = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
        double x1 = 4;
        double y1 = 5;

        double x2 = 5;
        double y2 = 4;

        double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("Distance: " + distance);


    }
}
