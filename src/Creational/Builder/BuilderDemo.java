package Creational.Builder;

public class BuilderDemo {

    /**
     * This pattern allows us to create different objects with different subcomponents.
     *
     * Checklist:
     *
     * To implement builder with director we have to:
     * 1. Declare builder interface
     * 2. Create multiple builders
     * 3. Create director that can work with different builders
     * 4. In client code instantiate director and concrete implementations of builder to build new objects.
     */

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector(new CheapComputerBuilder());

        computerDirector.buildComputer();

        Computer cheapComputer = computerDirector.getComputer();
        System.out.println(cheapComputer);

        computerDirector.setComputerBuilder(new ExpensiveComputerBuilder());
        computerDirector.buildComputer();

        Computer expensiveComputer = computerDirector.getComputer();
        System.out.println(expensiveComputer);
    }
}
