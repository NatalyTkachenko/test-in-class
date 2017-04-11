package classwork.Lesson2;

/**
 * Created by dn-na on 11/04/2017.
 */
public class ContinueStatement {
    public static void main(String[]args){
        int i = 0;
        while(i++<10){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
