package homework.oop;

/**
 * 1.Класс Cat и статическая переменная catCount
 В классе Cat создай статическую переменную public int catCount.
 Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
 catCount увеличивается на 1. Создать 4 объектов Cat и вывести значение переменной catCount на экран.

 */
public class Cat {
    public static int catCount;
    public Cat(){
        catCount++; // аналогично catCount = catCount +1;
    }


}

