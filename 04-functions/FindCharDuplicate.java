import java.util.Arrays;
import java.util.Scanner;

public class FindCharDuplicate {
    static final int MAX_CHAR = 256;
    public static void main(String[] args) {
      String str = "farmaan";
      showDuplicates(str);
    }
    static void countDuplicates(String str, int[] ch){
        for(int i = 0; i < str.length(); i++){
            ch[str.charAt(i)]++;
        }
    }

    static void showDuplicates(String str){
        int[] ch = new int[MAX_CHAR];
        countDuplicates(str, ch);
        for(int i = 0; i < MAX_CHAR; i++){
            if(ch[i] > 1){
                System.out.printf("%c-%d\n", i, ch[i]);
            }
        }
    }
}
