package Structural.Composite;

public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer( "Name1", 1,"Pro dev");
        Employee dev2 = new Developer( "Name2", 2,"Pro dev");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
    }
}
