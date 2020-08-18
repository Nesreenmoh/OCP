public class BuilderPatternTester {

    public static void main(String[] args) {


        Vehicle car= new Vehicle.VehicleBuilder("1G5666", 4).setAirbag(3).build();
        Vehicle bike= new Vehicle.VehicleBuilder("13YU4", 2).build();

        System.out.println(car.getWheel());
        System.out.println(car.getEngine());
        System.out.println(car.getAirbag());

        System.out.println(bike.getWheel());
        System.out.println(bike.getEngine());
        System.out.println(bike.getAirbag());
    }
}
