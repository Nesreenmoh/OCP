
/*
API has many terminal operations that aggregate a stream to a type of to a primitive.
for example, count(), max(), min(), sum() but these works according to predefined implementation.
developer can customize a stream reduction mechanism by using reduce(), collect()
Reduce() there are three variations of this method
Identity: the initial value for an accumulator or a default value if a stream is empty and there is
nothing to accumulate
accumulator(): A function which specifys a logic of aggregation of elements. As accumulator creates a new value
for every step of reducing. the quantity of a new value equals to the streams size and only that last value
is useful.

combiner: a function which aggregates results of the accumulator. combiner is called only in a parallel mode
to reduce results of accumulators from different threads.
 */


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class _StreamReduction {
    public static void main(String[] args) {

        // will take 1,2,3 -> 1+2+3 -> 6
        OptionalInt reduce= IntStream.range(1,4).reduce((a,b)->a+b);
        System.out.println(reduce); // 6


        // 1,2,3,10 -> (1+2+3)+10 -> 16
        int reduceTwoParams=
                IntStream.range(1,4).reduce(10, (a, b)-> a+b);
        System.out.println(reduceTwoParams);
        
        /*
        parallel stream
        1+10 = 11
        2+10 = 12
        3+10 = 13
        11+12+13 -> 36
         */
        
        int reduceParallel = Arrays.asList(1,2,3).parallelStream()
                .reduce(10, (a, b)->{
                  return   a+b;
                });

    }
}
