public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
//      Distance between two points D = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
        double x1 = 4;
        double y1 = 5;

        double x2 = 5;
        double y2 = 4;
        System.out.println(distpoint(x1,x2,y1,y2));
//        double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
//        System.out.println("Distance: " + distance);
    }
    static double distpoint(double x1, double x2, double y1, double y2){
        return  Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }
}