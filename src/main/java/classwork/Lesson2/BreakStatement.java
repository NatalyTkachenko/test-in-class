package classwork.lesson2;

/**
 * Created by dn-na on 11/04/2017.
 */
public class BreakStatement {
    public static void main(String[]args){
        int i = 0;
        while(true){
            if (i>10){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
