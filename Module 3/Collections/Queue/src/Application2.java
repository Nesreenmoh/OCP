import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/*
creating a Java interface Queue and its implementation
classes that implements Queue interface are ArrayDeque and LinkedList
ArrayDeque is a pure double ended queue
LinkedList is not efficient as ArrayDeque

FIFO

 */
public class Application2 {

    public static void main(String[] args) {
        // define and declare a queue
        Queue<String> queue = new LinkedList<>();
//        System.out.println(queue.element());
        // add elements returns boolean boolean add(E e)
        queue.add("Java");
        queue.add("JavaScript");
        queue.add("Angular");
        queue.add("HTML");


        // printing a queue using foreach
//        queue.forEach(System.out::println);
        // retrun the element by order of entry and
        // it will raise an NoSuchElementException if it is empty
//        System.out.println(queue.element());

        // method that add en element to the end of the queue and return boolean if successful
        // boolean offer(E e)
        queue.offer("Nesreen");
        queue.forEach(System.out::println);

        // remove an element and return the element that has been removed
        // E remove()
        System.out.println("The removed is "+ queue.remove());
        queue.forEach(System.out::println);

        // E poll(E e) add elements and return the element that has been deleted
        // if empty return null
        System.out.println("The poll element is "+queue.poll());
        queue.forEach(System.out::println);

        // E peak() return the first element in the queue
        // return null if the queue is empty
        System.out.println("The peak element is "+queue.peek());

    }
}
