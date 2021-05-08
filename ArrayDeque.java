import java.util.*;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new java.util.ArrayDeque<Integer>(10);
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        dq.add(6);
        System.out.println("DeQueue: ");
        System.out.println(dq);

        dq.addFirst(0);
        System.out.println("DeQueue add first: ");
        System.out.println(dq);

        dq.addLast(7);
        System.out.println("DeQueue add last: ");
        System.out.println(dq);

        dq.remove();
        System.out.println("DeQueue remove: ");
        System.out.println(dq);

        dq.removeFirst();
        System.out.println("DeQueue remove first: ");
        System.out.println(dq);

        dq.removeLast();
        System.out.println("Deque Remove last: ");
        System.out.println(dq);

    }
}