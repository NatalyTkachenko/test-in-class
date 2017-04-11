package classwork;

/**
 * Created by dn-na on 11/04/2017.
 */
public class ObjectClassArea {
    public static void main(String[] args) {
       Square s = new Square(5);
       // s.l = 5;
       System.out.println("площадь квадрата со стороной " + s.l + " = " + area(s));

       Rectangle r =  new Rectangle(4,6);
       //r.a = 4;
       //r.b =6;
        System.out.println("площадь прямоугольника  со сторонами " + r.a + " и " + r.b + " = " + area(r));
    }
    public static double area (Square s){
        return s.l*s.l;
    }

    public static double area (Rectangle r){
        return r.a*r.b;
    }
}
