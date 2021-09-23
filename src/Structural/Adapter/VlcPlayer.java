package Structural.Adapter;

class VlcPlayer implements AdvancedMediaPlayerInterface {
    String myFile;

    @Override
    public void loadFilename(String filename) {
        myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file.  Name: " + myFile);
    }
}