/*
Hashmap has no order
merge(k, v, BiFunction()) return value
if the value is null it replace it with the new value 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergApp {
    public static void main(String[] args) {

        // define a mapper
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorite = new HashMap<>();
        favorite.put("Jenny", "Bus Tour");
        favorite.put("Tom", "Tram");
        favorite.put("Sara", null);

        String jenny = favorite.merge("Jenny", "Skyride", mapper);
        String tom = favorite.merge("Tom", "Skyride", mapper);
        String sara = favorite.merge("Sara", "Alkomem", mapper);

        System.out.println(favorite);


    }
}
