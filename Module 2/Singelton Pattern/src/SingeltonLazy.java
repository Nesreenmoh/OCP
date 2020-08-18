public class SingeltonLazy {

    // create a private static variable without instantiation
    // so it will not reserve a place in the memory
    // this is called a lazy instantiation
    private static SingeltonLazy instance;

    // create a private constructor so nobody will able to instantiated
    private SingeltonLazy(){}


    // create a public static method so we can call it and get instatnce
    // but first we need to ask if it is null we will create an object or we return the object

//    public static SingeltonLazy getInstance(){
//
//        if(instance==null){
//            instance= new SingeltonLazy();
//        }
//        return instance;
//    }

    // synchronized method so it will be thread-safe
    // but this way will effect the performance of the program
    // it is slow
    // to solve this problem we create something called Double-Checked Locking
//    public static synchronized SingeltonLazy getInstance(){
//
//        if(instance==null){
//            instance= new SingeltonLazy();
//        }
//        return instance;
//    }


    // We synchronized the block ONLY so it will not always ask or check
    // we make it fast
    // thread-safe
    public static SingeltonLazy getInstance(){

        if(instance==null){
            synchronized (SingeltonLazy.class){
                if(instance==null){
                    instance= new SingeltonLazy();
                }
            }
        }
        return instance;
    }

}
