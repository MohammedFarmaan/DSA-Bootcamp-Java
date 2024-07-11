import java.util.Scanner;

public class PalindromeString {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.next();
        System.out.println(isStringPalindrome(str));
//        String reverse = "";
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            reverse = reverse + str.charAt(i);
//        }
//
//        if (str.equals(reverse)){
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not a palindrome");
//        }
    }
    static boolean isStringPalindrome(String str){
        String rev = "";
        String originalStr = str;
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev +  str.charAt(i);
        }
        return originalStr.equals(rev);
    }
}
