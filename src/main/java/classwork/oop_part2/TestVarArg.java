package classwork.oop_part2;

/**
 * Created by dn-na on 13/04/2017.
 */
public class TestVarArg {
    public int calcSum(int...values){
        int res = 0;
        for(int x:values){
            res+=x;
        }
        return res;
    }
}
