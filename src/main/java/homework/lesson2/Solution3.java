package homework.lesson2;

/**
 Расставить правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20
 public class Solution {
 int a = 1;
 int b = 3;
 int c = 9;
 int d = 27;
 public static void main(String[] args) {
 int result = + a + b + c + d;
 System.out.println(result);
 }
 }
 Требования:
 1. Значения переменных: a, b, c, d не изменяй.
 2. Перед каждой из переменных: a, b, c, d в строке с объявлением переменной result должен стоять один знак плюс либо минус.
 3. В результате работы программы на экран нужно вывести число 20.
 4. Знаки плюс и минус должны быть расставлены правильно.
 */
public class Solution3 {
    public static void main (String[]args){
        int a = 1;
        int b = 3;
        int c = 9;
        int d = 27;
        int result = - a + b - c + d;
        System.out.println("Результат суммы чисел a, b, c, d: " + result);
    }
}
