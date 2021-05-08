import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        int n = 15;
        Supplier<Integer> sFunction = () -> n+100;
        //IntSupplier sFunction = () -> n+100;
        System.out.println(sFunction.get());

        String s = "Success";
        Supplier<String> sFun = ()-> s+"ful";
        System.out.println(sFun.get());
    }
}
