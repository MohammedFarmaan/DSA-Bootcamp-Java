import java.util.Scanner;

public class PalindromeString {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.next();

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}