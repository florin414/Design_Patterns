package Structural.Composite;

public class Company {

     /**
      *                  company
      *                 /       \
      *         department1     department2
      *         /       \              \
      *   employee1  employee2         employee3
      *
      *  This design pattern allows us to create tree structured objects, which are grouped by certain properties.
      *
      * Checklist:
      *
      * 1. Make sure that you can apply tree-like structure for your components
      * 2. Create unified interface that will combine operations on the group of objects and on the single object.
      * 3. Create class of single object
      * 4. Create class for group of objects that implement the same unified interface.
      * 5. Add operations to add and remove components into the container
      */

    public static void main(String[] args) {
        Employee dev1 = new Developer( "Name1", 1,"Pro dev");
        Employee dev2 = new Developer( "Name2", 2,"Pro dev");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
    }
}
