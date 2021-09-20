package Creational.FactoryMethod;

import java.io.File;

public class AbstractFactoryDemo {

    /**
     * Lets you choose what concrete object to use. It is used to standardize the architectural
     * model for our application. Each application decides what object needs to instantiate.
     * This pattern is good if the instantiated class is never changed or the instantiation takes
     * place in an operation of an application that can easily override it, such an initialization
     * operation.
     * <p>
     * The objects are always different.
     * <p>
     * Checklist:
     * <p>
     * 1. Define hierarchy of objects
     * 2. Design the arguments for the factory method.
     * 3. Call Factory method during the runtime to instantiate the object
     */

    public static void main(String[] args) {

        Archiver zipArchiver = ArchiveFactory.getArchiver(ArchiveFactory.ZIP_ARCHIVER);
        Archiver rarArchiver = ArchiveFactory.getArchiver(ArchiveFactory.RAR_ARCHIVER);

        if (zipArchiver != null) {
            zipArchiver.archive(new File(""));
        }

        if (rarArchiver != null) {
            rarArchiver.archive(new File(""));
        }
    }
}
