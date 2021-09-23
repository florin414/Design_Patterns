package Behavioral.Strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    /**
     * This design pattern allows us to swap objects wherever we need.
     *
     * Checklist:
     *
     * 1. Identify group of algorithms in your app
     * 2. Create an interface for such group of algorithms
     * 3. Create concrete classes that implements the interface and concrete algorithms
     * 4. Use strategy in client code wherever it is needed
     */

    public static void main(String[] args) {

        CompressionContext ctx = new CompressionContext();
        ctx.setCompressionStrategy(new ZipCompression());

        // get a list of files...
        List<File> fileList = new ArrayList<>();
        ctx.createArchive(fileList);

        ctx.createArchive(fileList, file -> System.out.println("Custom compression strategy"));
        ctx.createArchive(fileList, Demo::customCompressStrategy);
    }

    public static void customCompressStrategy(List<File> files) {
        System.out.println("Custom compression strategy");
    }

}