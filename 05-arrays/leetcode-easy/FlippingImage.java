public class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0}, {1,0,1}, {0,0,0}};
        arr = flipAndInvertImage(arr);
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < (n + 1)/2; j++){
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - j - 1] ^ 1;
                image[i][n - j - 1] = temp;
            }
        }
        return image;
    }
}
