import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {


    // does not work
//    public static void addSounds(List<? extends Object> list){
//       list.add();
//    }

    public static void addSounds(List<? super String> list){
        list.add("Hello");

    }

    public static void main(String[] args) {
        List<String> str1=new ArrayList<>();
        str1.add("Tweet");
        List<Object> objects= new ArrayList<Object>(str1);
        addSounds(str1);
        addSounds(objects);
    }
}
