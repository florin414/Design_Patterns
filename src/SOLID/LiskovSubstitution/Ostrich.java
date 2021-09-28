package SOLID.LiskovSubstitution;

public class Ostrich implements Bird {

    @Override
    public void eat() {
        System.out.println("Ostrich eats");
    }
}