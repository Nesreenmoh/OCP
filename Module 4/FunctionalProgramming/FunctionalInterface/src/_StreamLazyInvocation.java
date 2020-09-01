/*
intermediate operations are Lazy invocation this means they will be invoked only if it is necessary
for terminal operation execution.
findFirst is a terminal operation that invoked the intermediate
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class _StreamLazyInvocation {
    static long counter;
    public static void main(String[] args) {

        List<String> list = Arrays. asList("abc1","abc2","abc3");
        counter=0;

        Optional<String> first = list.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        }).map(element -> {
            return element.toUpperCase();
        }).findFirst();
        System.out.println(first); // ABC2

        /*
        intermediate operations which reduce the size of the stream should be
        placed before operations which are applying to each element. so keep such
        methods as skip(), filter(), distict() at the top of your stream pipeline
         */
        long size= list.stream()
                .skip(2)
                .map(element->{
                    wasCalled();
                    return element.substring(0,3);
                }).count();

        System.out.println(size);
    }



    public static void wasCalled(){
        counter++;
    }
}
