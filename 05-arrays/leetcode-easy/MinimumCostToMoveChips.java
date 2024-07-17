public class MinimumCostToMoveChips {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(minimumCost(arr));
    }
    static int minimumCost(int[] postion){
        int even = 0;
        int odd = 0;
        for(int i = 0; i < postion.length; i++){
            if(postion[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
