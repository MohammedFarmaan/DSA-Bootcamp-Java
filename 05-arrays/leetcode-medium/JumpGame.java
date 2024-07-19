public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums){
        int lastGoodPosition = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= lastGoodPosition){
                lastGoodPosition = i;
            }
        }
        return lastGoodPosition == 0;
    }
}
