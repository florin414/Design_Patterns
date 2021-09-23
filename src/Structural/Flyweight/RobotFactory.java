package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, Robot> robots = new HashMap<>();
    public static final String SMALL_ROBOT = "small";
    public static final String LARGE_ROBOT = "large";

    public Robot getRobot(String robotType) {
        Robot myRobot = null;

        if (robots.containsKey(robotType)) {
            myRobot = robots.get(robotType);
        } else {
            switch (robotType) {
                case SMALL_ROBOT:
                    myRobot = new SmallRobot();
                    robots.put(SMALL_ROBOT, myRobot);
                    break;

                case LARGE_ROBOT:
                    myRobot = new LargeRobot();
                    robots.put(LARGE_ROBOT, myRobot);
                    break;
                default:
                    break;
            }
        }
        return myRobot;
    }

    public int getRobotFactorySize() {
        return this.robots.size();
    }
}
