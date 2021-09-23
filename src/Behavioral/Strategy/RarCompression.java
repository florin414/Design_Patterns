package Behavioral.Strategy;

import java.io.File;
import java.util.List;

public class RarCompression implements CompressionInterface {

    @Override
    public void compressFiles(List<File> files) {
        // using RAR approach
        System.out.println("Rar compression");
    }
}