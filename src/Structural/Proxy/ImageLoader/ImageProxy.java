package Structural.Proxy.ImageLoader;

public class ImageProxy implements Image {

    private String fileName;
    private RealImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void diplay() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.diplay();
    }
}
