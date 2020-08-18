public class ImmutableClassTester {

    public static void main(String[] args) {

        Engine engine = new Engine(12);
        ImmutableClass immutableClass= new ImmutableClass(123456, "Driver", engine);
        System.out.println(immutableClass.getId() + " "+ immutableClass.getName()+ " "+immutableClass.getEngine().speed);

        // if we try to change the value of the engine, it will not change and it will take the old value
        engine.speed=14;
        System.out.println(immutableClass.getId() + " "+ immutableClass.getName()+" "+immutableClass.getEngine().speed);

    }
}
