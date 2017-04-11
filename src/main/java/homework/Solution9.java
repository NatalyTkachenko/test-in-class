package homework;

/**
 * Написать функцию min которая принимает 2 параметра и возвращает меньший из них.
 * Тут надо использовать конструкцию if else
 * public class Solution {
 * public static int min(int a, int b) {
 * //напишите тут ваш код
 * }
 * <p>
 * public static void main(String[] args) throws Exception {
 * System.out.println(min(12, 33));
 * System.out.println(min(-20, 0));
 * System.out.println(min(-10, -20));
 * }
 * }
 */
public class Solution9 {
    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12,  33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
