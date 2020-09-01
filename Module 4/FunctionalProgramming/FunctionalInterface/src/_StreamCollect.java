/*
collect is a terminal operation
it accepts an argument of a type of Collector, which specifies the mechanism of reduction

 */




import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    private int price;
    private String name;

    public Product(String name, int price){
        this.name=name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class _StreamCollect {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("Potatoes", 23),
                new Product("lemon", 13),
                new Product("orange", 14),
                new Product("bread", 23)
        );

        /* convert the list to stream then return the name of the products
         collect them and return the result as list
         */
        productList.stream().map(Product::getName).collect(Collectors.toList());

        /*
        [Potatoes, lemon, orange, bread]

         */
        String collect = productList.stream().map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(collect);


        /*
        processing the sum of all of the prices of the products in the stream
        summingInt, summarizingLong, summarizingDouble, summarizingInt, summingDouble,summingLong
        providing a mapping and no need to use map
         */
        int collect2 = productList.stream()
                .collect(Collectors.summingInt(Product::getPrice));
        System.out.println("the sum is "+collect2);

        /*
        processing the average of the prices of products in the stream and
        return double
         */
        double collect1 = productList.stream()
                .collect(Collectors.averagingDouble(Product::getPrice));
        System.out.println("the average is "+collect1);

        /*
        IntSummaryStatistics create a statical report by applying toString method
        the result will be
        IntSummaryStatistics{count=4, sum=73, min=13, average=18,250000, max=23}
         */

        IntSummaryStatistics collect3 = productList.stream()
                .collect(Collectors.summarizingInt(Product::getPrice));
        System.out.println(collect3);
    }

}
