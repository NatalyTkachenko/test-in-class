package homework;

/**
 Создать метод, проверяющий и сообщающий на экран, является ли целое число записанное в переменную n, чётным или нечётным.
 */
public class Solution10 {
    public static void main(String[] args) {
        printDivisionResult(25);
    }
    public static void printDivisionResult(int n){
        if (n % 2 == 0) {
            System.out.println("Число " + n + " четное");
        }else {
            System.out.println("Число " + n + " нечетное");
        }

    }

}
