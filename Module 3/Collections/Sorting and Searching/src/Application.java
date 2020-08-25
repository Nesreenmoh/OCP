/*
Java.util.Collections has a sort method and binarySearch
binary search is fast but need the data to be sorted
We need to implement comparator interface to sort a user defined class then sorted
 */

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Random generator= new Random();
        List<Integer> myNum= new ArrayList<>();
        IntegerComparator integerComparator= new IntegerComparator();

        for(int i=0;i<20;i++){
            myNum.add(generator.nextInt(20)+1);
        }

        System.out.println("Unsorted numbers");
        myNum.forEach((p)->System.out.print(p+" "));

        // using a linear search to find a number
        int findTarget= find(myNum,15);
        System.out.println("The target is in the place of "+findTarget);

        // sorting the list
        System.out.println("My numbers after it is sorted");
        Collections.sort(myNum, integerComparator);
        myNum.forEach((p)->System.out.print(p+" "));

        // using a binarySearch to find a number
        int findTarget2=Collections.binarySearch(myNum,20, integerComparator);
        System.out.println("The number is in "+ (findTarget2));
    }

    // linear search
    public static int find(List<Integer> list,  Integer target){
        int found= -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==target){
                found=i; break;
            }
        }
        return found;
    }
}
