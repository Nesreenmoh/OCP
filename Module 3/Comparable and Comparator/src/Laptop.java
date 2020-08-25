import java.util.Comparator;

/*
make the class implement the interface Comparable<ClassName> and define the generic type of this class
implement the compareTo method to take object of this class
CompareTo has one Object only to be pass and will be compare with the current class object with this.
 */
public class Laptop implements Comparable <Laptop>, Comparator {
    private String name;
    private int ram;
    private int price;

    
    public Laptop(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop laptop) {
        if(this.price>laptop.price) return 1;
        else if (this.price<laptop.price) return -1;
        else return 0;
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }
}
