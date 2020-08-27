import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {

        // using BiFunction interface
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    // BiFunction interface takes two parameters and return a result
    //BiFunction<T,V,R>
   static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction=
        (numberToIncrementByOne, numberToMultiplyBy)
                -> (numberToIncrementByOne+1) * numberToMultiplyBy;

    // imperative approach
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number +1 )*numToMultiplyBy;
    }
}
