import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Maria", "999999"));

        // call the consumer by the variable name.accept
        greetCustomerConsumercustomer.accept(new Customer("Nesreen", "888888"));

    }

    // using Consumer<customer> return Nothing 
    static Consumer<Customer> greetCustomerConsumercustomer=
            customer-> System.out.println("Hello "+ customer.customerName+ " Your number is "
                    +customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.customerName+ " Your number is "+customer.customerPhoneNumber);
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
