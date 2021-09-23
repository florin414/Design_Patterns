package Behavioral.Command;

public class LightOffCommand implements Command {

    // Reference to the receiver object
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOff();
        System.out.println("Light is off");
    }
}