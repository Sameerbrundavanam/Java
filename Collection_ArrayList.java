
import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList in Java (like vector in C++) – Part of java.util package
 *
 * ➤ Declaration:
 *     ArrayList<Type> list = new ArrayList<>();
 *
 * ➤ Common Methods:
 *     - add(element)                 → Adds element at the end
 *     - add(index, element)          → Inserts element at specified index
 *     - get(index)                   → Returns element at index
 *     - set(index, element)          → Updates value at index
 *     - remove(index)                → Removes element at index
 *     - remove(Object)               → Removes first occurrence of the object
 *     - size()                       → Returns number of elements
 *     - isEmpty()                    → Returns true if list is empty
 *     - contains(element)            → Returns true if element is present
 *     - clear()                      → Removes all elements from the list
 *     - indexOf(element)             → Returns first index of the element
 *     - lastIndexOf(element)         → Returns last index of the element
 *     - toArray()                    → Converts ArrayList to array
 *
 * ➤ Looping Techniques:
 *     - for loop using index
 *     - enhanced for-each loop
 *     - iterator (advanced)
 *
 * ➤ Note:
 *     - Can’t store primitives directly, use wrapper classes (Integer, Double, etc.)
 *     - Preserves insertion order
 */

public class Collection_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<10;i++){
            al.add(i/3);
        }
        // for(int n:al){
        //     System.out.println(n);
        // }

        //Iterator
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
