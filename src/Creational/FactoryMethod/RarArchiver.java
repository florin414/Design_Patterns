package Creational.FactoryMethod;

import java.io.File;

public class RarArchiver implements Archiver {
    @Override
    public void archive(File destination) {
        System.out.println("Rar archiver");
    }
}
