import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZero++;
            } else if(nums[i] == 1){
                countOne++;
            }else if (nums[i] == 2){
                countTwo++;
            }
        }
        int[] ans = new int[nums.length];
        for(int i = countZero; i < nums.length; i++){
            ans[i] = 1;
        }
        for(int i = countZero + countTwo; i < nums.length; i++){
            ans[i] = 2;
        }

        System.out.println(Arrays.toString(ans));
    }
}
