public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,45,85,90};
        int target = 85;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // int mid = (start + end) / 2; // might be possible (start + end) may exceed range of integers in java
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }
}
