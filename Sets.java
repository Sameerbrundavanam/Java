import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


// Set is an Interface so it cannot be instantiated directly
/*
 *  ▸ HashSet        → Unordered, fastest operations (uses hash table)     → unordered_set (C++)
 *  ▸ LinkedHashSet  → Maintains insertion order (uses Hash Table + DLL)   → No direct equivalent in C++, but resembles set in insertion order
 *  ▸ TreeSet        → Sorted set (uses Red-Black Tree internally)         → set (C++) — maintains sorted order and uniqueness
 */

public class Sets {
    public static void main(String[] args) {
        //HashSet <=> Unordered_Set
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<5;i++){
            st.add(i);
        }
        System.out.println(st);
        for(int i=0;i<5;i++){
            st.add(i);
        }
        st.add(10);
        st.add(-1);
        for(int ele:st){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(st.contains(10));
        st.remove(5);
        System.out.println(st.contains(2));
        st.remove(2);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Set<Integer> lhst = new LinkedHashSet<>();
        Random rand = new Random();
        for(int i=0;i<5;i++){
            int num = rand.nextInt();
            System.out.println(num);
            lhst.add(num);
        }
        System.out.println(lhst);
        System.out.println();
        for(int i=0;i<5;i++){
            int num = rand.nextInt();
            System.out.println(num);
            st.add(num);
        }
        System.out.println(st);
        System.out.println();
        Set<Integer> ts = new TreeSet<>();
        for(int i=0;i<5;i++){
            int num = rand.nextInt();
            System.out.println(num);
            ts.add(num);
        }
        System.out.println(ts);
    }
}
