// creational design pattern
//used when we have too many arguments and you assign them in the constructor
// create a static nested class which contains all the fields called VehicleBuilder
// builder has a public constructor
// builder has methods for optional parameters, methods will return the builder
// for the optional parameters we will have setter methods
// the build() method will return the final object
// you can use chaning methods
// the main class has  a private constructor
// main class has only getters


public class Vehicle {

    // necessary fields
    private String engine;
    private int Wheel;

    // optional field
    private int airbag;


    // private constructor

  private Vehicle(VehicleBuilder VehicleBuilder){
      this.engine=VehicleBuilder.engine;
      this.Wheel=VehicleBuilder.wheel;
      this.airbag= VehicleBuilder.airbag;
  }
    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return Wheel;
    }

    public int getAirbag() {
        return airbag;
    }


    // create nested static class called (Vehicle Builder )

    public static class VehicleBuilder {

      // required fields
      private String engine;
      private int wheel;
      // optional fields
      private int airbag;

      // setting the values of the required fields in the constructor
      public VehicleBuilder(String engine, int wheel){
          this.engine=engine;
          this.wheel=wheel;
      }

      // setter for the optional field and return then object
      public VehicleBuilder setAirbag(int  airbag){
          this.airbag=airbag;
          return this;
      }

      public Vehicle build(){
          return new Vehicle(this);
      }

    }
}
