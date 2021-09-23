package Behavioral.Strategy;

import java.io.File;
import java.util.List;

@FunctionalInterface
public interface CompressionInterface {
    void compressFiles(List<File> files);
}