import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map an Generic interface from java.uti and does not extend Collection Interface
Map accept two things <K,V> key and value
Map can contains duplicates Values only not Keys
Map interface implements by the classes HashMap, LinkedHashMap, TreeMap, HashTable
HashMap is not sorted and used Hashcode to check the duplicated keys
LinkedHashMap is sorted as the entry ordered
TreeMap the key is ordered as alphabet and accepts No null keys
HashTable id as Vector an old and thread-safe and accept No null keys or values

 */
public class Application {

    public static void main(String[] args) {

        Map<String, String> phoneNumbers= new HashMap<>();

        // V put(k,v) add the key and value retrun the value or null
        // if the key is exist,it replace the value
        // if the key is different it adds a new entry
        phoneNumbers.put("Nesreen", "0628971379");
        phoneNumbers.put("Anis", "0657524429");
        phoneNumbers.put("Mohammed", "0657524423");



        // boolean containsKey(Object key) returns whether the key is exist in the Map
        System.out.println("The key Mohammed is exist "+phoneNumbers.containsKey("Mohammed"));

        // boolean containsValue(Object value) returns whether the value is exist in the Map
        System.out.println("The value of Mohammed is exist "+phoneNumbers.containsValue("0657524423"));

        // V remove(Object key) returns the value of the object that has been removed
        // or return null if the key is not exist
        System.out.println("The removed value is "+phoneNumbers.remove("Mohammed"));
        // V get(object key) take the key and returns the values
        System.out.println("The value of this key is "+phoneNumbers.get("Nesreen"));
        // int size() return int
        System.out.println("the size of the map is "+phoneNumbers.size());
        //boolean isEmpty() returns whether the map is empty or not
        System.out.println(phoneNumbers.isEmpty());

        // printing the entry record in the HashMap
        phoneNumbers.forEach((k,v)-> System.out.println(k +" "+ v));

        // Set<K> keySet() return all the keys in the map
        System.out.println("The keys are ");
        Set<String> keysList = phoneNumbers.keySet();
        keysList.forEach(System.out::println);

        // values() return Collection<V> of all values in the map
        System.out.println("The values are "+phoneNumbers.values());

        // void clear() will remove everything from the map
        phoneNumbers.clear();

        System.out.println("The map after we clear");
        // printing the entry record in the HashMap
        phoneNumbers.forEach((k,v)-> System.out.println(k +" "+ v));


    }
}
