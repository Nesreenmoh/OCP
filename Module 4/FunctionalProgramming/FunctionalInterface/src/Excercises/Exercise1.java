package Excercises;

/*
print only odd numbers use functional interfaces
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {
        Set<Integer> myNumbers=
                new HashSet<>(Arrays.asList(13,3,4,5,7,6,9,8,10,77,22,44,79));

        myNumbers.stream()
                .filter(n-> n%2!=0) // filter only the odd numbers
                .map(oddNum->oddNum*oddNum*oddNum) // cubes the odd numbers
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
