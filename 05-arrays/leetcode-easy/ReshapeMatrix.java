import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
        arr = matrixReshape(arr, 1, 4);
        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
        public static int[][] matrixReshape(int[][] mat, int r, int c) {
            int rows = mat.length;
            int cols = mat[0].length;
            if((rows * cols) != (r * c)){
                return mat;
            }
            int[][] reshape = new int[r][c];
            int outputRows = 0;
            int outputCols = 0;

            for (int i = 0; i < rows; i++){
                for (int j = 0; j < cols; j++){
                    reshape[outputRows][outputCols] = mat[i][j];
                    outputCols++;
                    if(outputCols == c){
                        outputCols = 0;
                        outputRows++;
                    }
                }
            }
            return reshape;
        }
}
