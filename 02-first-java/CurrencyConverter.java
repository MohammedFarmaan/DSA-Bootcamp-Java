import java.util.Scanner;
public class CurrencyConverter {

    public static void main (String[] args) {
        float usd_value = 83.48f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the indian Currency: ");
        int inr_currency = input.nextInt();
        System.out.println(inrToUsd(inr_currency));
//        float usd_currency = inr_currency / usd_value;
//        System.out.println("USD : " + usd_currency);
    }

    static int inrToUsd(int inr){
        float usd = 83.48f;
        return (int) (inr/usd);
    }
}
