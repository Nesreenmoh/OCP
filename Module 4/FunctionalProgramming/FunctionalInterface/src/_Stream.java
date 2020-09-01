/*
streams used to provide an ability to apply a finite sequence of operations to the source of
elements in a functional style, but not to store elements

has a intermediate operations
has a terminal operations and that make it inaccessible
only one terminal operation can be used per stream
streams java 8 cannot be reused

Stream pipeline which is a chain of stream source, intermediate operations, and a terminal operation

 */


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {
        // creating an empty stream empty()
        Stream<String> streamEmpty= Stream.empty();

        // creating stream of collection(Collection, List, Set)
        Collection<String> collection = Arrays.asList("a","b","c");
        Stream<String> streamOfCollection = collection.stream();


        // creating a stream of array
        String[] arr= new String[]{"a","b","c", "d"};
        Stream<String> streamOfArray = Arrays.stream(arr);
        // creating a stream from part of array Arrays.stream(array, startelementInc, endelementExc)
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayPart.forEach(System.out::println);

        // build() used to create a desired type and it should be specified in the right side
        Stream.Builder<String> buildStream = Stream.<String>builder().add("Nesren").add("Mohammed");

        // stream.generate() accept Supplier<T> for element generation. resulting an infinite stream
        //so you should specify a desired size or generate method will work until you kill the program.

        Stream<String> generateStream = Stream.generate(() -> "Generate Stream").limit(5);
        generateStream.forEach(System.out::println);

        // iterate(startpoint, logic) is an infinite stream , you need to limit the output
        Stream<Integer> iterateStream = Stream.iterate(30, number -> number + 2).limit(10);
        iterateStream.forEach(System.out::println);

//        Stream<String> streamString=Stream.of("ä","b","c").filter(element->element.contains("b"));
//        Optional<String>anyElement= streamString.findFirst();
//        System.out.println(anyElement);

        List<String> ListString=Stream.of("ä","b","c")
                .filter(element->element.contains("b"))
                .collect(Collectors.toList()); // change it to list
        Optional<String>anyElement= ListString.stream().findFirst(); // change it to stream to used findFirst()
        System.out.println(anyElement);

        List<String> list =  Arrays.asList("abc1","abc2", "abc3");
        long count = list.stream()
                .skip(1) // intermediate operations
                .map(element -> element.substring(0, 3)) // intermediate operations
                .sorted() // intermediate operations
                .count(); // terminal operations -> return long
        System.out.println(count);

    }

    // empty() used to avoid returning null stream
    public Stream<String> streamOf(List<String> list){
        return list==null|| list.isEmpty()? Stream.empty(): list.stream();
    }

}

