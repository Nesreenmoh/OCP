import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class IFpresentIfAbsent {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> mapper= (k,v)->v+1;

        Map<String , Integer> ages = new HashMap<>();
        ages.put("Jenny", 1);
        ages.put("Tom", null);



        // use BiFunction(Take1, Take2, return)
        Integer Jenny= ages.computeIfPresent("Jenny", mapper);
        Integer sam= ages.computeIfPresent("Tom", mapper);
        // does not add a key if it is not there
        // computeIfAbsent uses Function(Take, return)
        Integer Sam= ages.computeIfAbsent("Sam", k ->3);
        System.out.println(ages);
    }
}
