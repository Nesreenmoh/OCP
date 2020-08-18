// immutable class means that the object will not be changed and nobody can change the values of the fields
// first the class must be final so no methods will be override
// fields are private and final nobody can change the values
// make Deep copy for Object: In the constructor, you must have a copy of the object,
// you do not pass the actual value to the field


// a simple class or it can be a String, Date, List object
class Engine{
    int speed;

    Engine(int speed){
        this.speed= speed;
    }
}


public final class ImmutableClass {

    // private final access modifier to the fields
    private final int id;
    private final String name;
    private final Engine engine;

    // create constructor and give values to the final fields
    public ImmutableClass(int id, String name, Engine engine){
        this.id= id;
        this.name=name;
        Engine newEngine = new Engine(engine.speed);
        this.engine=newEngine;
//        this.engine=engine; // this only should not used, it allows the user to change the value
    }

    // getter for the fields ONLY no setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }
}
