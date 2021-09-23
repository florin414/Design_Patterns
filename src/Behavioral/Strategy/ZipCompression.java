package Behavioral.Strategy;

import java.io.File;
import java.util.List;

public class ZipCompression implements CompressionInterface {

    @Override
    public void compressFiles(List<File> files) {
        //using ZIP approach
        System.out.println("Zip compression");
    }

}
