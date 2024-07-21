public class SearchInRange {
    public static void main(String[] args) {
    int target = 64;
    int[] arr = {12,435,13,64,56};
    System.out.println(searchInRange(arr, target, 1,3));
    }
    static int searchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
