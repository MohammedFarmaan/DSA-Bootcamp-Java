public class PeakIndexInArray {
    public static void main(String[] args) {

    }
    static int peakIndexInMountainArray(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    while(start < end){
        int mid = start - (end - start) / 2;
        if(arr[mid] > arr[mid + 1]){
            // you are in dec part of the array
            // this may be an answer, but look at left
            // this is why end != mid - 1;
            end = mid;
        }else{
            // you are in asc part of array
            start = mid + 1; // because we know mid + 1 > then mid element
        }
    }
        return start;
    }
}
