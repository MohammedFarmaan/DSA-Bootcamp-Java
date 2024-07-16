import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},
                          {9,3,8,7},
                          {15,16,17,12}};
        List<Integer> result = luckyNumbers(matrix);
        System.out.println("Lucky Numbers: " + result);
    }public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int min = 999_999_99; // if you want comma in integers you can use _ ;
            int minIdx = 0;
            for(int j = 0; j < matrix[i].length ; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minIdx = j;
                }
            }
            boolean isTrue = true;
            for(int j = 0 ; j < matrix.length; j++){
                if(matrix[i][minIdx] < matrix[j][minIdx]){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
                arr.add(matrix[i][minIdx]);
            }
        }
        return arr;
    }
}
