import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class Collection1 {
    public static void main(String[] args){
        String[]  suits = {"Hearts","Diamond","Spade","Club"};
        List<String> l1 = Arrays.asList(suits);

        System.out.printf("Unsorted :%s%n", l1);
        Collections.sort(l1);

        System.out.printf("Sorted :%s%n", l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("Reverse Sorted :%s%n", l1);

    }
}
