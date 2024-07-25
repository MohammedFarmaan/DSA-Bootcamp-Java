public class RotatedArrayCount {
    public static void main(String[] args) {
        // int[] arr = {15, 18, 2, 3, 6, 12};
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(cpuntRotations(arr));
    }
    static int cpuntRotations(int[] arr){
        int pivot = findPivot(arr);
        // cause if pivot is -1 + 1 = 0
        // if(pivot == -1){
        //     return 0;
        // }
        return pivot + 1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // case 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // case 3
            if(arr[mid] < arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
