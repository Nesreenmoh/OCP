import java.util.Arrays;
import java.util.stream.Stream;

/*
A method reference is a compact, easy to read handle for a method that already has a name
// types of Method references
1.Reference to a static method,Syntax:ContainingClass::staticMethodName, Sting::valueOf, Lambda(s->String.valueOf(s))
2.Reference to an instance method of a particular Object,Syntax:ContainingObject::instanceMethodName, s::toString, Lambda(s->s.toString())
3.Reference to a instance method of arbitary object of a given type,Syntax:ContainingType::MethodName, Sting::toString, Lambda(s->s.toString())
4.Reference to a constructor, Syntax: className::new, MethodReference: String::new, Lambda(()-> new String
More compact than Lambda but not flexible as Lambda
 */
public class Application {

    public static void main(String[] args) {
        String[] nameArray ={"Barbara", "James", "Mary", "John","Robert", "Michael", "Linda", "james", "mary"};

        // using lambda
//        Arrays.sort(nameArray, ((s, t1) -> s.compareToIgnoreCase(t1)));
//        for(String s:nameArray){
//            System.out.print(s+" ");
//        }


        // using Method reference
        Arrays.sort(nameArray, String::compareToIgnoreCase);
        // print as convertit as list using Collection Arrays.asList
        System.out.print(Arrays.asList(nameArray));
        // print by using stream
        Stream.of(nameArray).forEach(System.out::print);
    }
}
