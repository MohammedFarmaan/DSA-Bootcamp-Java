import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str1 = "farmaan";
        String str2 = "farmaan";
        char[] chArray1 = str1.toCharArray();
        char[] chArray2 = str2.toCharArray();
        Arrays.sort(chArray1);
        Arrays.sort(chArray2);
        if(chArray1.length != chArray2.length){
            System.out.println("not same");
        }
        boolean flag = false;
        for(int i = 0; i < chArray1.length; i++){
            if(chArray1[i] != chArray2[i]){
                flag = false;
            }else{
                flag = true;
            }
        }
        if(flag){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
