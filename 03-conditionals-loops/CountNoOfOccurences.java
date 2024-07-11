public class CountNoOfOccurences {

    public static void main(String[] args) {
        int n = 155 ;
        System.out.println(count(n));
//        int count = 0;
//
//        while(n > 0) {
//            int rem = n % 10;
//            if (rem == 2) {
//                count++;
//            }
//            n = n / 10;
//        }
//
//        System.out.println(count);
    }

    static int count(int n){
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            if (rem == 5){
                count++;
            }
        }
        return count;
    }
}
