/*
a class that implement Comparator interface and implement the method compare
The class become comparator and I can call it from the Collections.sort

 */
import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return a-b;
    }
}
