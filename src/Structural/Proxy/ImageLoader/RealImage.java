package Structural.Proxy.ImageLoader;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void diplay() {
        System.out.println("Displying " + fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("Loading "+ fileName);
    }
}
