import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;


public class Function1 {
    public static void main(String[] args) {
        //TODO Auto- Generated method stub
        List<Integer> l1 = new ArrayList<>();
        l1.add(14);
        l1.add(16);
        int n = 9;
        Function<Integer,Integer> fun = val -> val+100;   //lambda Expression
        System.out.println(fun.apply(n));
        //for (int i = 0; i<2; i++) {
            //System.out.println(fun.apply(i));
        //}
    }
}
