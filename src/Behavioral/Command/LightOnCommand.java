package Behavioral.Command;

public class LightOnCommand implements Command {

    // Reference to the receiver object
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOn();
        System.out.println("Light is on");
    }
}