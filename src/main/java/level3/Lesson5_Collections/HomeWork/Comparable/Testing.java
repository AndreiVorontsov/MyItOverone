package level3.Lesson5_Collections.HomeWork.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class Testing {

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        Collections.addAll(arr, 1, 2, 3, 4, 5, 6);
//        Collections.replaceAll(arr,6,10);
//        arr.replaceAll( elem -> elem * 2 );
//        System.out.println(arr.toString()); // [2, 4, 6, 8, 10, 12]
////        ArrayList<Integer> arr = new ArrayList<Integer>(); Collections.addAll(arr, 1, 2, 3, 4, 5, 6);
//        Integer max = Collections.max(arr, new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer x, Integer y) {
//                        return x.compareTo(y);
//                    } });
//        System.out.println(max);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 1, 2, 3, 4);
        ListIterator<Integer> it = arr.listIterator();
        System.out.println(it.previousIndex()); // -1
        it.next();
        System.out.println(it.nextIndex()); // 1
        System.out.println(it.previousIndex()); // 0
        it = arr.listIterator(arr.size());
        System.out.println(it.nextIndex()); //4
        it.previous();
        System.out.println(it.nextIndex()); // 3
        System.out.println(it.previousIndex()); // 2
   }
}
