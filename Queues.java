
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/*
 * ▸ Queue             → FIFO structure (like std::queue in C++)               → LinkedList (Java)
 * ▸ Deque             → Double-ended queue (like std::deque in C++)          → ArrayDeque / LinkedList (Java)
 * ▸ PriorityQueue     → Min-Heap by default (like std::priority_queue in C++)→ PriorityQueue (Java)
 */


public class Queues {
    public static void main(String[] args) {
        //Same as the ordinary queue in C++
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<5;i++){
            Random rand = new Random();
            //A safer method than .add() as this doesn't throw the IllegalStateException Exception as the latter one
            q.offer(rand.nextInt(11));
        }
        Iterator it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.contains(3));



        Deque<Integer> dq= new ArrayDeque<>();
        for(int i=0;i<2;i++){
            Random rand = new Random();
            dq.addFirst(rand.nextInt(101));
            dq.addLast(rand.nextInt(101));
        }
        System.out.println(dq);
        System.out.println(dq.peekFirst() + " " + dq.peekLast());
        System.out.println(dq.size());

        //Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<5;i++){
            Random rand = new Random();
            pq.add(rand.nextInt(151));
        }
        System.out.println(pq);
        System.out.println(pq.peek());
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        System.out.println(pq.size());

        //Max Heap
        PriorityQueue<Integer> mpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<5;i++){
            Random rand = new Random();
            mpq.add(rand.nextInt(151));
        }
        System.out.println(mpq);
        System.out.println(mpq.peek());
        while(!mpq.isEmpty()){
            System.out.println(mpq.poll());
        }
        System.out.println(mpq.size());
    }
}
