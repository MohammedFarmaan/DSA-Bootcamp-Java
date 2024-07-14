public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int ans = diagonalSum(arr);
        System.out.println(ans);
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++){
            sum = sum + mat[i][i] + mat[i][n - 1 - i];
        }
        if(n % 2 == 0){
            return sum;
        }else {
            return sum - mat[n/2][n/2];
        }
    }
}
