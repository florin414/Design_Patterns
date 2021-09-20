package Creational.AbstractFactory;

public class AbstractFactoryDemo {

    /**
     * Used when we need to create a group of interdependent classes, without specifying their
     * concrete classes.
     * The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces
     * for each distinct product of the product family. Then you can make all variants of products
     * that follow those interfaces.
     *
     * Checklist:
     * <p>
     * 1. Implement class groups or so-called type families.
     * 2. Declare Abstract Factory interface with factory method per product.
     * 3. Use abstract factory to instantiate group of related objects
     */

    public static void main(final String[] args) {
        GUIBuilder builder = new GUIBuilder();

        AbstractWidgetFactory widgetFactory;

        String platform = "MACOSX";

        if (platform.equals("MACOSX")) {
            widgetFactory = new MacOsWidgetFactory();
        } else {
            widgetFactory = new MSOsWidgetFactory();
        }

        builder.buildWindow(widgetFactory);
    }
}