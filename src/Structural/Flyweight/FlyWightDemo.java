package Structural.Flyweight;

public class FlyWightDemo {
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
