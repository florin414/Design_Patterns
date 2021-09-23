package Behavioral.Mediator;

public class Demo {

    /**
     * This design pattern promotes loose coupling by keeping objects from referring to
     * each other explicitly. We can reduce the direct interconnections among objects.
     * In other words, the mediator is the one who takes the responsibility of communication
     * among a group of objects. Acts as an intermediary who can track the communication between
     * two objects. The other objects in the system are also aware of this mediator. They know that
     * if they need to communicate among themselves, they need to go through the mediator.
     *
     * Checklist:
     *
     * 1. Identify group of classes that you want to decouple.
     * 2. Create new abstraction and encapsulate all interactions inside a new class - mediator class.
     * 3. Update all existing classes to make them interact with mediator object only.
     */

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Tv tv = new Tv(mediator);
        Button remoteControlButton = new Button(mediator);
        Display display = new Display(mediator);

        mediator.setTv(tv);
        mediator.setPowerDisplay(display);

        System.out.println("fan.isOn(): " + tv.isOn());

        remoteControlButton.press();
        System.out.println("fan.isOn(): " + tv.isOn());

        remoteControlButton.press();
        System.out.println("fan.isOn(): " + tv.isOn());
    }
}