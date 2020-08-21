import java.util.ArrayList;
import java.util.List;

interface Liquid{}
class Glass<T> {
}

class Juice implements Liquid{}

class OrangeJuice extends Juice{}

class Tray {
    // define an instance variable as generic
    Glass<?> instanceVariable;

//    public void add(Glass<Juice> juiceGlass){}
   public void add(Glass<?> juiceGlass) // this will work as we define this method as generic with ?
   {
       Glass<?> localVariable; // define local variable as generic
   }


}



public class WildCard {
    public static void main(String[] args) {

        Tray  tray= new Tray();
        // here you can pass any object String, Juice or anything
        tray.add(new Glass<String>());
        tray.add(new Glass<Juice>());

//        tray.add(new Glass<?>()); // during instatiation cannot be becuase the runtime needs to know what is the type

    }
}
