

public class SingeltonTester {

    public static void main(String[] args) {
        // create two objects
        SingeltonEager singeltonEager1 = SingeltonEager.getInstance();
        SingeltonEager singeltonEager2 = SingeltonEager.getInstance();

        // print the hashcode of the objects to see if they are the same instance
        System.out.println(singeltonEager1);
        System.out.println(singeltonEager2);

        // create objects from SingeltonLazy class
        SingeltonLazy singeltonLazy1= SingeltonLazy.getInstance();
        SingeltonLazy singeltonLazy2= SingeltonLazy.getInstance();

        // print the objects
        System.out.println(singeltonLazy1);
        System.out.println(singeltonLazy2);


    }
}
