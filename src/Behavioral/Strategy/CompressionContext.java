package Behavioral.Strategy;

import java.io.File;
import java.util.List;

public class CompressionContext {

    private CompressionInterface strategy;

    public void setCompressionStrategy(CompressionInterface strategy) {
        this.strategy = strategy;
    }

    // use the strategy
    public void createArchive(List<File> files) {
        // do something
        strategy.compressFiles(files);
        // do something
    }

    // or just pass strategy to the method
    public void createArchive(List<File> files, CompressionInterface cs) {
        // do something
        cs.compressFiles(files);
        // do something
    }

}