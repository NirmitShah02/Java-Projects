import java.util.*;
import java.util.function.Predicate;
// Java program to illustrate Simple Predicate (since Java 8)
import java.util.function.Predicate;
//not written any functional interface...........

public class PredicateEx2 {
    public static void main(String args[]) {
        // lambda expression with single parameter num
        //String s = "successfully";
        Predicate<String> s1 = (s) -> s.length()>10; // lambda expression.
        Predicate<String> s2 = (s) -> s.startsWith("S");
        System.out.println(s1.test("Hi"));
        System.out.println(s1.test("successfully"));
        System.out.println(s1.test("Understood"));
        //test (abstract method) returns a boolean value

        List<String> l1 = new ArrayList<String>();
        Collections.addAll(l1, "Great fullness", "Usefulness", "Successful");
        l1.stream().filter(s1).forEach(System.out::println);

    }
}