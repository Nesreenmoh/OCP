import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

/*

 */
public class _Function {

    public static void main(String[] args) {
        int increment= Increment(0);
       // System.out.println(increment);

        //Function interface
        // take one parameter and return a result
        // function.apply()

        Function<Integer, Integer>incrementByOneFunction = number->number+1;

        //System.out.println(incrementByOneFunction.apply(2));

        // function.apply().andThen
        // create a variable that will call another variable to add the will take the result and * 10
        Function<Integer, Integer> MultiplyBy10= incrementByOneFunction.andThen(number->number *10);
        System.out.println(MultiplyBy10.apply(2));



    }


    // this method take one parameter and return a result
    static int Increment(int number){
        return number+1;
    }
}
