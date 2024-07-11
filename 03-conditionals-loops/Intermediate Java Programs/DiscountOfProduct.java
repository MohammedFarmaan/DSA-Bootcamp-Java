import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Discount price = sp - (sp * discount percent/100)
        double sp = in.nextDouble();
        double discount_percent = in.nextDouble();
        System.out.println(discount(sp, discount_percent));

//        double discount_price = sp - (sp * discount_percent / 100);
//        System.out.println("Discounted price: " + discount_price);
    }
    static double discount(double sp, double dp){
        return (sp - (sp * dp/100));
    }
}
