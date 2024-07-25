public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,7,0,1,2};
        int target = 5;
        System.out.println(search(arr, target));
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        // if you did not find pivot element not rotated
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length -1);
        }
        // if pivot is found you have 2 asc sorted array
        // case 1
        if(nums[pivot] == target){
            return pivot;
        }
        // case 2
        if(target >= nums[0]){
            return binarySearch(nums, target, 0,pivot - 1);
        }
        // case 3
        return binarySearch(nums, target, pivot + 1,nums.length - 1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    // will not work for duplicate values in start, end, mid
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // total 4 cases
            // case 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // case 3
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            // case 4
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
