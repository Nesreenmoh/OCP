/*
Collection is interface
Collections is a class that we use to call method sort Collections.sort(List)
List interface extends Collection interface
List is Ordered by index collection
List allows duplicates values
List inherits Methods from Collection interface
ArrayList and LinkedList classes implements List interface

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();// by defualt the capacity is 10

        // Collection method boolean add(E element) method returns boolean that the item has been added
        //List has void add(E element)
        //List has void add(int index, E element)
        //list int indexOf(Object o)
        animals.add("Lion");
        animals.add("cat");
        animals.add("Dog");
        animals.add(1, "mouse");
        animals.add("Bird");


        // Collection method boolean remove(Object object) overloaded method returns boolean and accept object/element
        // Collection method boolean remove(int index); overloaded method return boolean and accept integer index of deleted item
        //List method void remove(int index)
        // List method E get(int index) return the item in specific index
        animals.remove("cat");
        System.out.println(animals.indexOf("Dog"));
        System.out.println(animals.lastIndexOf("mouse"));
        System.out.println(animals);
        System.out.println(animals.get(3));


        // boolean isEmpty() return boolean and check if the list is empty
        // int size() return the size of the list
        System.out.println(animals.isEmpty());
        System.out.println(animals.size());

        // printing the list
        Iterator<String> itr=animals.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        // Collection method boolean contains(Object object) return true of false and check if certain value inside the list
        System.out.println(animals.contains("Lion"));
        //  Collection method void clear() clear everything in the list
        animals.clear();
        System.out.println(animals);


    }
}

