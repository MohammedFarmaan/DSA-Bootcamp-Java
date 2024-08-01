public class GenerateOddStrings {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateOddStrings(n));
    }
    static String generateOddStrings(int n){
        int count = (n % 2 == 0) ? n - 1 : n;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append('a');
        }
        if(n % 2 == 0){
            result.append('b');
        }
        return result.toString();
    }
}
