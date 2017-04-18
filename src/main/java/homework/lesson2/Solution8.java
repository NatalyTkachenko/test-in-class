package homework.lesson2;

/**
 Реализуй метод printCircleLength. Параметр метода — радиус окружности. Метод должен вывести на экран длину окружности, рассчитанной по формуле: L = 2 * Pi * radius.
 Результат — дробное число (тип double).
 В качестве значения Pi использовать значение 3.14.
 */
public class Solution8 {
    public static void main (String[]args){

        printCircleLength(9.99);
    }
    public static void printCircleLength (double r){
        double pi = 3.14;
        System.out.println("Длина окружности: " + (2*pi*r));

    }
}
