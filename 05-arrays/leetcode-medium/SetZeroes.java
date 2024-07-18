import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
    }
    public static void setZeroes(int[][] matrix) {
        int[] coords = new int[2];
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    coords[0] = i;
                    coords[1] = j;
                }
            }
        }

        for(int i = 0; i < m; i++){
            matrix[i][coords[0]] = 0;
            for(int j = 0; j < n; j++){
                matrix[coords[1]][j] = 0;
            }
        }

        for(int i = 0; i < m; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
