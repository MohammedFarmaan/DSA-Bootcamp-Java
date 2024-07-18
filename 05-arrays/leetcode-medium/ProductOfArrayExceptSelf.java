import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] nums) {
//        Takes a lot of time complexity
//        int[] ans = new int[nums.length];
//        for(int i = 0; i < nums.length; i++){
//            int product = 1;
//            int temp = i;
//            for(int j = 0; j < nums.length; j++){
//                if(i != j){
//                    product *= nums[j];
//                }
//            }
//            ans[i] = product;
//        }
//        return ans;

//        this is solving the solution with division but the follow-up asks to do without division
//        int multiply = 1;
//        int zeroCount = 0;
//        int n = nums.length;
//        for(int i = 0; i < n; i++){
//            if(nums[i] == 0){
//                zeroCount++;
//            }else{
//                multiply *= nums[i];
//            }
//        }
//        if(zeroCount == 0){
//            for(int i = 0; i < n; i++){
//                nums[i] = multiply / nums[i];
//            }
//        }else if(zeroCount == 1){
//            for(int i = 0; i < n; i++){
//                if(nums[i] == 0){
//                    nums[i] = multiply;
//                }else{
//                    nums[i] =  0;
//                }
//            }
//        } else {
//            for(int i = 0; i < n; i++){
//                nums[i] = 0;
//            }
//        }
//        return nums;
        int n = nums.length;
        int[] arr = new int[n];
        int curr = 1;
        for(int i = 0; i < n; i++){
            arr[i] = curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n -1; i >= 0; i--){
            arr[i] *= curr;
            curr *= nums[i];
        }
        return arr;
    }
}
