import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();

        System.out.println("Good morning " + name);
    }
}
