import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {

    public static void main(String[] args) {
        
        List<Laptop> laptops = new ArrayList<>();
        
        laptops.add(new Laptop("Del", 8, 700));
        laptops.add(new Laptop("Apple", 12, 1200));
        laptops.add(new Laptop("Acer", 16, 800));

        // to sort a user define class, the class should implement Comparable interface
        // Collection.sort class accept extends Comparable or List<T>
        Collections.sort(laptops);

        // implementing  a compare interface to compare the class by another field
        // implementing by using anonymous class
        // sorting it as ram value from bigger to less
        Comparator<Laptop> comparator= new Comparator<Laptop>() {
            @Override
            public int compare(Laptop laptop1, Laptop laptop2) {
                if(laptop1.getRam()>laptop2.getRam()) return -1;
                else if(laptop1.getRam()>laptop2.getRam()) return 1;
                else return 0;
            }
        };
        Collections.sort(laptops, comparator);
        laptops.forEach(System.out::println);
    }

}
