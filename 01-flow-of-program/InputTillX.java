import java.util.Scanner;
public class InputTillX {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        
        while (true) {
            String num = sc.next();
            if (num.equals("x")) {
                break;
            }
            
            int number = Integer.parseInt(num);
            sum += number;
        }

        System.out.println(sum);
        sc.close();
    }
}