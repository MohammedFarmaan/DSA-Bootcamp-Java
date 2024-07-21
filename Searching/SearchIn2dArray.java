import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{345, 13, 634, 23},
                        {45,345,4,2},
                        {123,53}};
        int target = 500;
        System.out.println(Arrays.toString(search2dArray(arr, target)));
    }
    static int[] search2dArray(int[][] arr, int target){
        if(arr.length == 0){
            return new int[] {};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
