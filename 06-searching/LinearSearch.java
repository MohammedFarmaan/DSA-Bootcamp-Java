public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,5,1,3,6,2,12};
        int target = 12;
        System.out.println(linearSearch(arr, target));
    }
    //     Search the array: return the index if found
    //     Is not found return - 1

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
