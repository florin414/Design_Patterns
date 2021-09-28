package SOLID.InterfaceSegregation;

public class Boat implements Sailable {

    @Override
    public void sail() {
        System.out.println("Boat sails");
    }
}