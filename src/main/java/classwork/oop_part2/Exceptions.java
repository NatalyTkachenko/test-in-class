package classwork.oop_part2;

/**
 * Created by dn-na on 13/04/2017.
 */
public class Exceptions {
    public static void main(String[] args) {
        // Exception example:
    /*int x1 = 10, x2 = 0;
    int y = x1/x2; */
        int[] arr = {1,2,3};
        try{
            int x = arr[5];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Program finished with status OK!");

    }

}
