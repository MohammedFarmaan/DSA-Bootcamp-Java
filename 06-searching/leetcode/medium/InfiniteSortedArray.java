public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        // solution is achieved by multiplying box to till n
        // First find the range
        // first start with the box size of two
        int start = 0;
        int end = 1;

        // condition for the target to lie with in range
        while(target > arr[end]){
            int temp = end + 1;
            // double the box value
            // end = previous end + (size of box) * 2;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
