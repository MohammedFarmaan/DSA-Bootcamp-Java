public class InsertStringToString {
    public static void main(String[] args) {
        String str = "GeeksGeeks";
        int index = 4;
        String strToInsert = "for";
        System.out.println(insertString(str,index,strToInsert));
    }

    static String insertString(String str, int index, String strToInsert){
        StringBuilder result = new StringBuilder(str);
        result.insert(index + 1, strToInsert);
        return result.toString();
    }
}
