import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;


public class Funtion4 {
    public static void main(String[] args) {
        double x = 9.32;
        DoubleToIntFunction di = val ->(int)val;
        System.out.println(di.applyAsInt(x));

    }
}
