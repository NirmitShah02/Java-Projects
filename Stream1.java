import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Stream1 {
    public static void main(String[] args) {
        //stream package
        //stream

        //1st we created stream of integer
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p*2));    //lambda Expression //aggregate operations



        //2nd we can create a stream from list elements
        List<Integer> l1 = new ArrayList();
        for (int i = 0; i<10; i++){
            l1.add(i);
        }
        //Collections is and collections
        //stream is package and Stream is class/interface
        System.out.println(l1);
        Stream<Integer> stream3 = l1.stream();
        //stream3.filter(predicate)
        stream3.forEach(p-> System.out.println(p*3));//intermediate and terminal methode
        System.out.println(l1);

        //3
        List<String> students = new ArrayList();
        students.add("Avani");
        students.add("Anish");
        students.add("Nirmit");
        students.add("Vipul");
        students.add("Anjali");
        students.add("Sarah");
        //applications of intermediate options of stream operations.
        students.stream().filter((s)-> s.startsWith("A")).forEach(System.out::println);


    }
}
