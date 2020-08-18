
// creational design pattern
//Used when we have multiple sub-classes of a suber class and based on input we
//want to return one class instance
// super class can be a basic class, abstract class of an interface
// factory class has a static method which returns the instance of sub class based on input


public abstract class Vehicle {
    public abstract int getWheel();

    public String toString(){
        return "Wheel: "+" "+this.getWheel();
    }
}

class Car extends Vehicle{

    int wheel;

    Car(int wheel){
        this.wheel=wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class Bike extends Vehicle{

    int wheel;

    Bike(int wheel){
        this.wheel=wheel;
    }


    @Override
    public int getWheel() {
        return this.wheel;
    }
}