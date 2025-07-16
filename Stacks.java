import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Stack;

/*
 * Stack in Java:
 * 
 * 1. Legacy Stack (Class: Stack)
 *    - Comes from java.util package.
 *    - Extends Vector (legacy class, synchronized).
 *    - Methods: push(), pop(), peek(), isEmpty(), search().
 *    - Thread-safe but not recommended for single-threaded usage due to overhead.
 *
 * 2. Modern Stack (Interface: Deque using ArrayDeque)
 *    - Preferred way to use a stack in Java.
 *    - Not thread-safe, but much faster in single-threaded scenarios.
 *    - Methods: push(), pop(), peek(), addFirst(), pollFirst(), etc.
 *    - Double-ended: can be used both as stack and deque.
 */


public class Stacks {
    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.addFirst(30);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pollFirst();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            st.add(rand.nextInt(100));
        }
        System.out.println(st);

        // Legacy Stack
        Stack<Integer> lst = new Stack<>();
        lst.push(10);
        lst.push(20);
        lst.push(30);
        System.out.println(lst);
        lst.pop();
        System.out.println(lst);
        lst.pop();
        System.out.println(lst);
        lst.pop();
        System.out.println(lst);
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            lst.push(rand.nextInt(100));
        }
        System.out.println(lst);
    }
}
