public class PrimeNumber {
    public static void main (String[] args) {
        int num = 36;
        int c = 2;
        boolean flag = true;
        while(c < num) {
            if (num % c == 0) {
                flag = false;
            }
            c = c + 1;
        }
        if (!flag) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");
        }
    }
}
