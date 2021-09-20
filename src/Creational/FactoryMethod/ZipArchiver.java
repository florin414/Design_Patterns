package Creational.FactoryMethod;

import java.io.File;

public class ZipArchiver implements Archiver {
    @Override
    public void archive(File destination) {
        System.out.println("Zip archiver");
    }
}
