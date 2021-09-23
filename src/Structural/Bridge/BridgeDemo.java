package Structural.Bridge;

public class BridgeDemo {

    /**
     * This pattern isolates different implementations of an abstraction. By using this pattern,
     * we can interchange objects between them without consequences. In this example, the two remotes
     * can control both the tv and the radio.
     */

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
