import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(arr, k);
    }
    static void rotateArray(int[] nums, int k){
//        int[] arr = new int[nums.length];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < nums.length; j++){
                swap(nums, j, i);
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int index1, int index2){
        int temp = index1;
        index1 = index2;
        index2 = temp;
    }
}
