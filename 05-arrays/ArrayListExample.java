import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Syntax of ArrayList
//        ArrayList<Integer> list = new ArrayList<>(5);

//        Syntax of multidimensional ArrrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println(list);

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                list.get(row).add(in.nextInt());
            }
        }

        System.out.println(list);

//      to add elements to list
//        list.add(12);
//        list.add(54);
//        list.add(3554);
//        list.add(73654);
//        list.add(5464);
//        list.add(5534);
////        to view all list elements
//        System.out.println(list);
////        to check if element present or not
////        System.out.println(list.contains(3554));
////      to update an elements value
//        System.out.println(list.set(0, 0));
////        to remove a element
//        System.out.println(list.remove(3));
//        System.out.println(list);

//        for(int i = 0; i < 5; i++){
//            list.add(in.nextInt());
//        }
//        System.out.println(list);
//        to get element in ArrayList use get() method
//        for (int i = 0; i < 5; i++){
//            System.out.println(list.get(i)); // pass index here arr[index] will not work here
//        }
    }
}
