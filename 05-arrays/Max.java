public class Max {
    public static void main(String[] args) {
        int[] arr = {5,2,9,12, 90};
        System.out.println(maxRange(arr, 0,2));
    }

//  Work  on edge cases like if array being null
    static int maxRange(int[] arr, int start, int end){
        if (arr == null){
            return -1;
        }

        if (end < start){
            return -1;
        }

        int maxVal = arr[start];
        for(int i = start; i <= end; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
//  Add edge cases here
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
