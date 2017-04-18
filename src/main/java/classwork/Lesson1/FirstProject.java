package classwork.lesson1;

/**
 * Created by dn-na on 06/04/2017.
 */
public class FirstProject {
    public static void main(String[] args) {
        hello("Name");
        hello("Surname");
        hello("Another word");
        double a = 6;
        System.out.println("Площадь квадрата со стороной " + a + "=" + area(a));
        double a1 = 5;
        double a2 = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a1 + " и " + a2 + " = " + area(a1, a2));

    }
    public static double area (double a1, double a2){
        return a1*a2;

    }
    public static double area (double a){
        return a*a;
    }

    public static void hello(String message){
    //String message = "world";
    System.out.println("Hello, " + message);
    }
}
