public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,8,15,19};
        int target = 7;
        // Ceiling of a number = smallest element in the array that is greater than or equal to array
        System.out.println(ceilOfNumber(arr, target));
    }
    static int  ceilOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
