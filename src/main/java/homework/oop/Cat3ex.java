package homework.oop;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by dn-na on 18/04/2017.
 * 2.Создать класс Cat3ex с 3мя конструкторами:
 -Имя
 -Имя, Возраст, Вес.
 - Вес, Цвет,
 Создать по экземпляру кота используя различные конструкторы
 */
public class Cat3ex {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Cat3ex (String name){
        this.name = name;
    }
    public Cat3ex(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat3ex(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    /*3. Добавить метод getCatInfo в класс Cat3ex который при вызове выдает информацию о коте
        -	Если есть  имя то выводить имя,
        -	Если Имя, возраст цвет - то выводить -”домашний кот по имени”  + имя кота
        -	Если нет имени - то выводить -” Бездомный кот цвета “ + цвет кота*/
    public String getCatInfo(){
        String s;
        if (this.name == null) {
            s = ("Бездомный кот цвета " + this.color);
        }else if (this.age !=0){
            s = ("домашний кот по имени: " + this.name);
        }else{
            s = ("имя кота " + this.name);
        }
        return s;

    }

}
