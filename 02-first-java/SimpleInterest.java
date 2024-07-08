import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal Amount: ");
        int principal = input.nextInt();
        System.out.print("Enter the time: ");
        float time = input.nextFloat();
        System.out.print("Enter the rate: ");
        float rate = input.nextFloat();

        float  simpleInterest = (principal * time * rate) / 100;

        System.out.println(simpleInterest);

    }
}
