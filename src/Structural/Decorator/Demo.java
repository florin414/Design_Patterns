package Structural.Decorator;

public class Demo {

    /**
     * This pattern allows us to add new functionalities to specific feature.
     * We can use multiple wrapping to "extend" an extension of a feature.
     *
     * Checklist:
     *
     * 1. Define common context
     * 2. Create a decorator type
     * 3. The core class and decorator class implement the same common interface with common context
     * 4. Implement different features that can be added to the common context by extending or implementing decorator type
     * 5. Implement additional and enhanced functionality in decorator classes
     */

    public static void main(final String[] args) {
        Car basicCar = new BasicCar();
        basicCar.drive();
        System.out.println("\n*****");

        SportsCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.drive();
        sportsCar.setTransmissionMode("sport+");
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.drive();
        System.out.println("\n*****");
    }
}