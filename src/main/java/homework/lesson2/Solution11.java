package homework.lesson2;

/**
 Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
 записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
public class Solution11 {
    public static void main(String[]args){
        double m = 8.5;
        double n = 11.45;
        double dif1 = Math.abs(m - 10);
        double dif2 = Math.abs(n - 10);
        if (dif1>dif2){
            System.out.println("Число " + n + " ближе к 10" );
        }else {
            System.out.println("Число " + m + " ближе к 10");
        }
    }
}
