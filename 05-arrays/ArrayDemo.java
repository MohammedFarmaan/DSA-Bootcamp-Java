import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5]; // primitives [] reference variable = new(creating new object) integer(datatype)[size]
//
//        arr[0] = 1;
//        System.out.println(Arrays.toString(arr));

//      one dimensional arrau
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        for (int row = 0; row < arr.length; row++){
//            arr[row] = in.nextInt();
//        }
//        for (int row = 0; row < arr.length; row++){
//            System.out.println(arr[row]);
//        }
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));

//        Enhnced for loop
//        for(int row: arr){
//            System.out.println(row);
//        }

//        two-dimensional array
//        int[][] arr = new int[3][3];
//
////      for every row
//        for(int row = 0; row < arr.length; row++){
////          for every each col in every row
//            for(int col = 0; col < arr.length; col++){
//                arr[row][col] = in.nextInt();
//            }
//        }
//
////      Printing 2d array
//        for(int row = 0; row < arr.length; row++){
//            for(int col = 0; col < arr.length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        int[][] arr = new int[3][3]; // here only row size is given
//        for(int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++){
//                arr[row][col] = in.nextInt();
//            }
//        }

//        for(int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        Enhanced for loop in 2d array
//        for(int[] a : arr){
//            System.out.println(Arrays.toString(a));
//        }

//        Array col not fixed
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
