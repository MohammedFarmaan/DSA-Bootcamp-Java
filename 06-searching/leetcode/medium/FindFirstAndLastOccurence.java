import java.util.Arrays;

public class FindFirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = binarySearch(arr, target, true);

        int end = binarySearch(arr, target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int binarySearch(int[] arr, int target, boolean findStartIndex){
        // potential answer
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                //  Occurrence may be present
                ans =  mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans ;
    }
}
