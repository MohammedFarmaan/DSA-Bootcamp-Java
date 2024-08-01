import java.util.Arrays;

public class DisplayEvenStrings {
    public static void main(String[] args) {
        String s = "Hello my name is farmaan";
        String[] strArray = s.split(" ");

        for(int i = 0; i < strArray.length; i++){
            if(strArray[i].length() % 2 == 0){
                System.out.println(strArray[i] + " ");
            }
        }
    }
}
