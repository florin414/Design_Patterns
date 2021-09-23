package Behavioral.Command;

public class Demo {

    /**
     * This design pattern is based on the command principle, give command to a specific object.
     * It allows us to make abstractions for different commands, without duplicating code. For example,
     * ctrl + c and right-click + copy commands do the same thing, but the command codes may be duplicated,
     * so this pattern creates abstractions for this two commands.
     *
     * Checklist:
     *
     * 1. Define the common interface for commands and identify the command entry point.
     * 2. Create implementations of this interface. Each command should store reference to the receiver
     * object. Also, command should store all necessary arguments to pass to receiver.
     * 3. Add command to the requester object - the one that sends the request.
     * 4. Invoke command's method when needed and pass all necessary arguments to interact with receiver.
     */

    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        // Switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // Switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}