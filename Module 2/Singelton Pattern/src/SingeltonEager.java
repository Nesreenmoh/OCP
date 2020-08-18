public class SingeltonEager {
    // define a private static variable so it will be shared among all the objects
    // this type of creation we call it EAGER instantiation because it will be create when the class load
    // weather you need it or not
    // declare and instantiation the field
    private static SingeltonEager instance= new SingeltonEager();

    // private constructor
    // so no one will be able to create instatnce from it
    private SingeltonEager(){}

    // create public static method so the user will be able to get an instance of this class

    public static SingeltonEager getInstance(){
        return instance;
    }

}

