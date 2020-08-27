import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {
    public static void main(String[] args) {


        Customer Maria = new Customer("Maria", "999999");

        // call the consumer by the variable name.accept
        greetCustomerConsumercustomer.accept(new Customer("Nesreen", "888888"));

        // call the BiConsumer
        HidePhoneNumber.accept(Maria, false);

    }


    // using Consumer<customer> return Nothing
    static Consumer<Customer> greetCustomerConsumercustomer =
            customer -> System.out.println("Hello " + customer.customerName + " Your number is "
                    + customer.customerPhoneNumber);

    // define BiConsumer
    static BiConsumer<Customer, Boolean> HidePhoneNumber= (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName + " Your number is " +
                    (showPhoneNumber ? customer.customerPhoneNumber: "**********"));

    // define Customer class
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
