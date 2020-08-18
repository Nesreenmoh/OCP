package Phone;

public class PhoneBuilder {

    // define the same fields that are in Phone class as private fields
    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;

    // No constructor has been define so the default constructor has been created

    // define setters for all the fields and return an object of PhoneBuilder

    public PhoneBuilder setOs(String os){
        this.os=os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor){
        this.processor=processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize){
        this.screenSize=screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery){
        this.battery=battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera){
        this.camera=camera;
        return this;
    }


    // define a method to create an object of the main class Phone and assign values
    // to the fields
    public Phone getPhone(){
        return new Phone(os,processor,screenSize,battery,camera);
    }
}
