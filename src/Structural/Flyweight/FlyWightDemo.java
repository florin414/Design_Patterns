package Structural.Flyweight;

public class FlyWightDemo {

    /**
     * This pattern is primarily used to reduce the amount of objects created, so in consequence, to reduce
     * the memory usage and increase performance. It tries to reuse already existing similar objects.
     *
     * Checklist:
     *
     * 1. Split state of our object in two groups - inner and outer state.
     * 2. Create a type where constant fields will be initialized through the constructor.
     * 3. Make sure that outer state may be passed as method arguments
     * 4. Create factory that will cache state and will return already created objects. Client should
     * request object with specific state but not created directly.
     * 5. Client should store outer state, or generate it and pass it as an argument to a flyweight.
     */

    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();

        Robot smallRobot = robotFactory.getRobot(RobotFactory.SMALL_ROBOT);
        Robot smallRobot1 = robotFactory.getRobot(RobotFactory.SMALL_ROBOT);

        smallRobot.print();
        smallRobot1.print();
        System.out.println(robotFactory.getRobotFactorySize());

        Robot largeRobot = robotFactory.getRobot(RobotFactory.LARGE_ROBOT);
        Robot largeRobot1 = robotFactory.getRobot(RobotFactory.LARGE_ROBOT);

        largeRobot.print();
        largeRobot1.print();
        System.out.println(robotFactory.getRobotFactorySize());
    }
}
