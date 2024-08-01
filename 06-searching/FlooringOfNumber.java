public class FlooringOfNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,8,15,19};
        int target = 2;
        // Flooring of a number = greatest number in the array that is less than or equal to target
        System.out.println(floorOfNumber(arr, target));
    }
    static int floorOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
