import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/*
 * Demonstration of Maps in Java Collections Framework:
 *
 * ➤ TreeMap        → Stores keys in sorted (natural) order
 * ➤ HashMap        → No guaranteed order; fast access (average O(1))
 * ➤ LinkedHashMap  → Maintains insertion order of keys
 *
 * Commonly used methods:
 * ➤ put(key, value)               → Inserts or updates a key-value pair
 * ➤ get(key)                      → Returns value for a key (null if not found)
 * ➤ getOrDefault(key, defaultVal)→ Returns value or default if key not found
 * ➤ containsKey(key) / containsValue(val)
 * ➤ remove(key) or remove(key, val)
 * ➤ replace(key, newValue)
 * ➤ keySet(), values(), entrySet()
 *
 * Iteration using entrySet() is recommended for accessing both key and value.
 */

public class Maps {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int i=0;i<5;i++){
            Random rand = new Random();
            int num = rand.nextInt(10);
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        System.out.println(mp);
        System.out.println(mp.get(1));
        System.out.println(mp.containsKey(3));
        System.out.println(mp.containsValue(2));
        if(mp.containsKey(1)){
            mp.remove(1);
        }
        System.out.println(mp);
        //Removes the key only if it has the specified value
        System.out.println(mp.remove(1, 1));
        System.out.println(mp);
        System.out.println(mp.keySet());
        for(int key:mp.keySet()){
            System.out.println(key);
        }
        for(int value:mp.values()){
            System.out.println(value);
        }
        for(Map.Entry<Integer,Integer> mpe : mp.entrySet()){
            System.out.println("The Key is: " + mpe.getKey() + " The value is: " + mpe.getValue());
        }
        System.out.println(mp.replace(2, 10));
        System.out.println(mp);
        System.out.println();

        Map<Integer,Integer> hmp = new HashMap<>();
        Random rand = new Random();
        for(int i=0;i<6;i++){
            int num = rand.nextInt(515);
            hmp.put(num,hmp.getOrDefault(num, 0)+1);
        }
        System.out.println(hmp);
        for(Map.Entry<Integer,Integer> me: hmp.entrySet()){
            System.out.println("Key: " + me.getKey() + " Value: " + me.getValue());
        }


        Map<Integer,Integer> lhmp = new LinkedHashMap<>();
        for(int i=0;i<6;i++){
            int num = rand.nextInt(1000);
            System.out.println(num);
            lhmp.put(num, lhmp.getOrDefault(num, 0)+1);
        }
        System.out.println(lhmp);
        for(Map.Entry<Integer,Integer> mpe : lhmp.entrySet()){
            System.out.println("Key: " + mpe.getKey() + "Value: " + mpe.getValue());
        }
    }
}
