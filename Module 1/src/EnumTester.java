public class EnumTester {
    enum Flavors{
        VANILLA,
        CHOCOLATE,
        STRAWBERRY
    }
    public static void main(String[] args) {
        Flavors flavors =  Flavors.STRAWBERRY;
        switch(flavors){
            case STRAWBERRY:
                System.out.println("STRAWBERRY");
                break;
            case CHOCOLATE:
                System.out.println("CHOCOLATE");
                break;
            case VANILLA:
                System.out.println("VANILLA");
                break;

        }

    }
}
