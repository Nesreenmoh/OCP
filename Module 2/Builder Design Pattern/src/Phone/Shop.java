package Phone;

public class Shop {

    public static void main(String[] args) {

        // create an object of Phonebuilder so we can assign values to the fields and
        // return an object of phone

        PhoneBuilder builder=new PhoneBuilder();
        builder.setOs("Apple 6S");
        builder.setProcessor("123DD");
        builder.setScreenSize(34);
        builder.setBattery(12);
        builder.setCamera(123);

        // create an object of a main class and call a method in the second class
        // phonebuilder to return the phone

        Phone phone=builder.getPhone();

        // call the toString method that has been overrided in the main class
        System.out.println(phone);
    }
}


