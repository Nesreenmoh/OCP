
import java.util.HashMap;
import java.util.Map;

public class EqualHashCodeTest {
    public static void main(String[] args) {

        Person person1= new Person("Nesreen", "234567");
        Person person2= new Person("Nesreen", "234567");

        System.out.println("Equal method provided by object class");
        // it looks for the objects that holds the both object so it returns False
        System.out.println(person1.equals(person2));

        // using Map
        Map<Person, Person_Identity> citizen= new HashMap<>();

        citizen.put(person1,new Person_Identity("Yemeni"));
        citizen.put(person2,new Person_Identity("Yemeni"));

        System.out.println(citizen.size());

        // this is helping any duplicate any values

        Integer num1= new Integer(1);
        Integer num2= new Integer(1);
        Map<Integer, String> values= new HashMap<>();
        values.put(num1,"Nana");
        values.put(num2,"Nana");
        System.out.println("Values size "+ values.size());
        System.out.println("Integers are equal  "+ num1.equals(num2));



    }

}

