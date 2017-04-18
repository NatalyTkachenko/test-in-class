package classwork.lesson1;

import java.util.Scanner;

/**
 * Created by dn-na on 06/04/2017.
 */
public class IfElse {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = in.nextInt();
        System.out.print("Введите y: ");
        int y = in.nextInt();
        if(x<y){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
