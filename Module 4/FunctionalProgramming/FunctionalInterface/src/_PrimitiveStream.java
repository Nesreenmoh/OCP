/*
Stream of primitives
creating streams out of long, double and int primitive
IntStream, LongStream, DoubleStream --Interfaces
to avoid unnecessary auto-boxing allows incread productivity
 */

import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class _PrimitiveStream {
    public static void main(String[] args) {

        // create a stream from a list of element first one and second one and the third one is not included
        // use rangeClosed to include the last element
        IntStream intStream= IntStream.range(1, 3);
        LongStream longStream = LongStream.range(1,3);
        DoubleStream doubleStream= DoubleStream.of(1,2,3);

        intStream.forEach(System.out::println);
        longStream.forEach(System.out::println);
        doubleStream.forEach(System.out::println);

        // because there is not CharStream IntStream is used to represent a stream of chars
        IntStream streamOfChars= "Nesreen".chars();
        streamOfChars.forEach(System.out::println);

        // creating a Stream of String
        Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Nesreen Yusuf");
        stringStream.forEach(System.out::print);

    }
}
