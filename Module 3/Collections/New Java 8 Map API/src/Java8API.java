
/*
boolean removeIf(Predicate<? super E> filter
void replaceAll(UnaryOperator<E> o) let take a lambad expression and apply an operation to all it member
List.forEach(lambda expression/method reference)
 */


import java.util.ArrayList;
import java.util.List;

public class Java8API {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        list.add("Doctor");
        list.add("Dentist");
        System.out.println(list);
        // remove all strings starts with D
        list.removeIf((p) -> p.startsWith("D"));
        // using ForEach to print the list
        list.forEach(System.out::print);
        System.out.println();

        list.replaceAll((p) -> p + ",");
        list.forEach(System.out::print);
    }
}
