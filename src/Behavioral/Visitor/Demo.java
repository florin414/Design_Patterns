package Behavioral.Visitor;

public class Demo {

    /**
     *  This design pattern represents an operation to be performed on the elements of an object
     *  structure (collection, list etc.). It lets you define a new operation without changing
     *  the classes of the elements on which it operates. It helps us to add new functionalities to
     *  an existing object structure in such a way that the old structure remains unaffected by these
     *  changes.
     *
     * Checklist:
     * 1. Create visitor interface and declare methods to visit each class of the element hierarchies
     * you need to work with.
     * 2. Declare and describe interface of Elements.
     * 3. Implement Element interface in each concrete class.
     * 4. Hierarchy of elements needs to be aware about the most abstract type of visitors. On the other
     * hand, hierarchy of visitors should know all concrete implementations of Element hierarchy.
     * 5. For each new behaviour create concrete implementation of Visitor interface.
     * 6. Client will create visitor object and then will pass it to the acceptance method of each
     * concrete element.
     */

    public static void main(String[] args) {
        GeoElement industrialBuilding = new IndustrialBuilding();
        GeoElement park = new Park();
        GeoElement privateBuilding = new PrivateBuilding();
        GeoElement shoppingCenter = new ShoppingCenter();

        ExportVisitor visitor = new XMLExportVisitor();
        visitor.export(industrialBuilding, park, privateBuilding, shoppingCenter);

        System.out.println("=======================================");

        visitor = new JSONExportVisitor();
        visitor.export(industrialBuilding, park, privateBuilding, shoppingCenter);
    }
}