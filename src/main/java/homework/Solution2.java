package homework;

import java.util.Scanner;

/**
 Написать программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
 Для считывания данных с клавиатуры использовать метод nextInt() класса Scanner.

 Требования:
 1. Программа должна выводить текст.
 2. В программе необходимо создать объект типа Scanner.
 3. Программа должна считывать данные с клавиатуры.
 4. Программа должна выводить квадрат считанного числа.
 */
public class Solution2 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        System.out.println("Квадрат числа: " + (a*a));
    }
}
