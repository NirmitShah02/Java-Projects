import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a2 = new ArrayList<String>();

        a2.add("Melbourne");
        a2.add("Adilade");
        a2.add("Singapore");
        a2.add("California");
        System.out.println("Size of a2:" +a2.size());
        System.out.println(a2);
        List<String> a1 = new ArrayList<String>();
        a1.add("Tiger");
        a1.add("Elephant");
        System.out.println(a1);
        a2.remove(1);
        System.out.println(a2);
        Iterator<String> itr = a2.iterator();
        while (itr.hasNext()){
            System.out.println(); }
    }
}
