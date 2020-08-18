import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Nesreen", "062897167379");
        phonebook.put("Anis", "0657567524429");
        phonebook.put("Dad", "06256731241");

        // to print the values of Map

        System.out.println("Print a value of specific key");
        System.out.println(phonebook.get("Nesreen"));

        System.out.println("****************************");
        // print the values of the Map by using a Set
        // one way by using Set
        System.out.println("Using Set Interface");
        Set<String> phones = phonebook.keySet();
        for (String s : phones) {
            System.out.println(s + ":" + phonebook.get(s));
        }
        System.out.println("**********************************");
        System.out.println("Using Map.Entry interface in Set interface");
        // second way using Map.entry
        Set<Map.Entry<String,String>> values= phonebook.entrySet();
        for(Map.Entry<String,String> e:values){
            System.out.println(e.getKey() + ":"+ e.getValue());
            e.setValue("III");
        }

    }
}
