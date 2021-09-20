package Creational.Prototype;

public class Client {
    /**
     * The prototype pattern refers to creating a duplicate object while keeping performance in mind.
     * It specifies the king of objects to create using a prototypical instance and creates objects
     * by copying this prototype. It is used when the creation of an object is costly.
     * It provides a mechanism to copy the original object to a new object and then modify it to our
     * needs.
     *
     * It uses java shallow cloning.
     *
     * Checklist:
     *
     * 1. Add clone() method to the hierarchy of the project
     * 2. Design a registry that maintains a cache of prototypical objects
     * 3. Design API that allows to clone object inside the factory and return object as a result
     * 4. Use factory API instead of NEW keyword to instantiate the objects
     */
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
    }
}
