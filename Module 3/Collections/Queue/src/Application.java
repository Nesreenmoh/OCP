import java.util.Queue;

public class Application {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(5);

        queue.show();
        System.out.println();
        queue.deQueue();
        queue.deQueue();


        System.out.println("The size is "+ queue.getSize());

        queue.show();
    }
}
