import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().trim();
        System.out.println(reverse(str));
//        String reverse = "";
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            reverse += str.charAt(i);
//        }
//        System.out.println(reverse);
    }
    static String reverse(String str){
        String rev = "";
        for(int i = str.length() - 1; i >=0 ; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}
