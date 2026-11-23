import java.util.*;

public class priority {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(70);
        pq.add(50);
        pq.add(30);
        pq.add(40);
        System.out.println(pq);

        pq.poll();
        pq.add(80);
        pq.peek();
        System.out.println(pq);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(100);
        pq2.add(300);
        pq2.add(800);
        System.out.println(pq2);
        pq2.poll();
        System.out.println(pq2);
    }
}
