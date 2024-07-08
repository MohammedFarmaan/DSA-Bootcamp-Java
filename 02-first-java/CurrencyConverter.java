import java.util.Scanner;
public class CurrencyConverter {

    public static void main (String[] args) {
        float usd_value = 83.48f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the indian Currency: ");
        float inr_currency = input.nextFloat();
        float usd_currency = inr_currency / usd_value;
        System.out.println("USD : " + usd_currency);
    }
}
