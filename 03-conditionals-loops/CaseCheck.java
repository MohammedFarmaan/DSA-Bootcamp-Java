import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        System.out.println(casec(ch));
//        if (ch >= 'a' && ch <= 'z') {
//            System.out.println("Lowercase");
//        } else {
//            System.out.println("Uppercase");
//        }
    }
    static String casec(char ch){
        if (ch >= 'a' && ch <= 'z'){
            return "lower";
        }
            return "upper";
    }
}
