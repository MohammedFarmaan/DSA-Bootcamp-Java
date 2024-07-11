public class EvenDaysOfMonth {
    public static void main(String[] args) {
        System.out.println(evenDays(31));
//        int count = 0;
//        for (int i = 1; i <=31; i++){
//            if (i % 2 == 0){
//                count++;
//            }
//        }
//        System.out.println(count);
    }
    static int evenDays(int totalDaysOfMonth){
        int count = 0;
        for (int i = 0; i < totalDaysOfMonth; i++){
            if (i % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
