package homework.oop;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
  * 1. Создать 4 объекта Cat и вывести значение переменной catCount на экран <- Делаем в методе main

 */
public class CatProgramm {
    public static void main(String[] args) {
        // создаем 4 объекта через цикл:
        for(int i=0;i<4;i++) {
            Cat cat = new Cat();
        }
        // выводим на экран количество:
        System.out.println(Cat.catCount);

        /*Для проверки задачи 3 из класска Cat3ex:
         Создаем три экземпляра класса с разными параметрами в классе main и вызываем метод, чтобы вывести инфо
        * о каждом коте на экран: */

        Cat3ex cat1 = new Cat3ex("Барсик");
        Cat3ex cat2 = new Cat3ex("Пушок",1,1);
        Cat3ex cat3 = new Cat3ex(2,"рыжий");
        System.out.println(cat1.getCatInfo());
        System.out.println(cat2.getCatInfo());
        System.out.println(cat3.getCatInfo());

    }
}
