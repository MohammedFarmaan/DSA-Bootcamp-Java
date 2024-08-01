public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "w3resource";
        System.out.println("The given string is: " + str1);
        System.out.println("The duplicate characters and counts are: ");
        showDuplicates(str1);
    }
    static final int MAX_CHARS = 256;

    static void CountCharacters(String str, int[] ch) {
        for (int i = 0; i < str.length(); i++)
            ch[str.charAt(i)]++; // Increment the count for the corresponding character.
    }
    static void showDuplicates(String str1) {
        int ch[] = new int[MAX_CHARS];
        CountCharacters(str1, ch);
        for (int i = 0; i < MAX_CHARS; i++) {
            if (ch[i] > 1)
                System.out.printf("%c  appears  %d  times\n", i, ch[i]);
        }
    }
}
