package classwork.lesson2;

import java.util.Arrays;

/**
 * Created by dn-na on 13/04/2017.
 */
public class ArrayMethods {
    public static void main(String[]args){
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {10,9,8,7,6,5,4,3,2,1};

        /*Arrays.equals

        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(arr1==arr2);
        System.out.println(Arrays.equals(arr1,arr2));
        */
        int[] intArr = {55,57,61,66,18,19,27,38,10,11,15,39,51,82,83,95};
        Arrays.sort(intArr);
        System.out.println("The sorted array is: ");
        System.out.println(Arrays.toString(intArr));

        int searchVal = 57;
        int retVal = Arrays.binarySearch(intArr, searchVal);
        System.out.println("The search index 57: " + retVal);






    }
}
