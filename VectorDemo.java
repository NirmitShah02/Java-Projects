import java.util.*;
public class VectorDemo {



    public static void main(String[] args) {
        int size = 3;
        int incr = 0;

        String st[] = {"Spring Roll", "Pizza", "Pasta"};
        Vector<String> v1 = new Vector<String>(); //default size = 10
        Vector<Integer> v2 = new Vector<Integer>(size); //constructor
        Vector<Double> v3 = new Vector<Double>(size, incr); //constructor
        v1.add("Hello");
        v1.add("My");
        v1.add("Dear");
        System.out.println(v1);
        List<String> l1 = new Vector<String>(Arrays.asList(st)); //we can create Vector using this method.

        System.out.println(l1);

//Default vector
        Vector vd = new Vector(); // object creation of Vector class.
        vd.add(23);
        vd.add("Any string ");
        System.out.println(vd);
        System.out.println(v3.capacity());
        v3.add(1.1); v3.add(1.2); v3.add(1.3); v3.add(1.4);
        System.out.println(v3.capacity());
    }
}