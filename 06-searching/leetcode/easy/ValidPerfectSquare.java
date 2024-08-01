public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPerfectSquare(n));
    }
    public static boolean isPerfectSquare(int num) {
        if(num < 1){
            return false;
        }
        long start = 1;
        long end = num;
        while(start <= end){
            long mid = start + (end - start) / 2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid > num) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
