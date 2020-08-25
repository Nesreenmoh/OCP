import com.sun.source.tree.WhileLoopTree;

import java.util.*;

/*
Set interface does not allow duplication
HashSet and LinkedList classes that implements SET
No order
 */
public class Application {
    public static void main(String[] args) {
//        Set<Integer> number= new TreeSet<>();
        NavigableSet<Integer> number= new TreeSet<>();
        /*
        methods of TreeSet from NavigableSet
        E lower(E e) return < e or null
        E floor(E e) return <=e or null
        E ceiling(E e) return >= e or null
        E higher(E e)  return > e or null
         */
        number.add(13);
        number.add(50);
        number.add(13);
        number.add(20);

        // No duplicat values
        System.out.println(number);
        System.out.println(number.higher(20));
        System.out.println(number.lower(20));
        System.out.println(number.ceiling(20));
        System.out.println(number.floor(20));



        HashSet<Animal> animals= new HashSet<>();

        animals.add(new Animal(13, "Lion"));
        animals.add(new Animal(10, "Cat"));
        animals.add(new Animal(13, "Lion"));
        animals.add(new Animal(14, "Horse"));

        System.out.println(animals);

        Set<Number> numbers =  new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iter=numbers.iterator();
        while( iter.hasNext()) System.out.println(iter.next());

    }


}
