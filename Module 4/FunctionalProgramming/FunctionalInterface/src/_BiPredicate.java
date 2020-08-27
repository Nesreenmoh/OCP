import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

/*
public interface BiPredicate<T, V>
has methods test(), and,or, negate
 */
public class _BiPredicate {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("B");

        list2.add("B");
        list2.add("A");
        System.out.println(compareContent);

    }

    static   BiPredicate< List<String>, Boolean> compareContent=
            (l1,l2) -> l1.equals(l2);

}
