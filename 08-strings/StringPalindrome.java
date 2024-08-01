public class StringPalindrome {
    public static void main(String[] args) {
        String str = "anna";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }
}
