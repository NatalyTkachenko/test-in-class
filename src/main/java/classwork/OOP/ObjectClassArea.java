package classwork.oop;

/**
 * Created by dn-na on 11/04/2017.
 */
public class ObjectClassArea {
    public static void main(String[] args) {
       // Экземпляр класса квадрат:
        Square s = new Square(5);
       // s.l = 5; <- атрибут
        // Вывод на экран площади прямоугольника:
       System.out.println("площадь квадрата со стороной " + s.l + " = " + s.area());



        // Экземпляр класса прямоугольник:
       Rectangle r =  new Rectangle(4,6);
       //r.a = 4; <- атрибут 1
       //r.b =6; <- атрибут 2
        // Вывод на экран площади квадрата
        System.out.println("площадь прямоугольника  со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }
    // методы для расчета площади прямоугольника и квадарата:
    public static double area (Rectangle r){
        return r.a*r.b;
    }

    public static double area (Square s){
        return s.l*s.l;
    }
}
