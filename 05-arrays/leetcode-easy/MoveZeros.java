import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,4,0,1};
        moveZeroes(arr);
    }
        public static void moveZeroes(int[] nums) {
            int j = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
