package DATA_STRUCTURES.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(4);
        q.add(7);
        q.add(0);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
    }
}
