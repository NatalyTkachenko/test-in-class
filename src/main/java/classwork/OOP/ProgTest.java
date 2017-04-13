package classwork.OOP;

/**
 * Created by dn-na on 13/04/2017.
 */
public class ProgTest {
    public static void main (String[]args){
        TestVarArg tstvararg = new TestVarArg();
        int sum0 = tstvararg.calcSum();
        int sum1 = tstvararg.calcSum(3);
        int sum2 = tstvararg.calcSum(55,66);
        int sum3 = tstvararg.calcSum(77,55,33,11,99);
        System.out.println(sum3);
    }
}
