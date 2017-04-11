package classwork.Lesson2;

/**
 * Created by dn-na on 11/04/2017.
 */
public class ArrayElem2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int num = arr.length;
        int a = 5;
        for (int i = 0; i < num; i++) {
            arr[i] = a;
            a++;
            System.out.println(arr[i]);
        }

    }
}
