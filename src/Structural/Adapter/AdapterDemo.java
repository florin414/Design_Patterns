package Structural.Adapter;

public class AdapterDemo {

    /**
     *  This pattern allows us to adapt a specific class to another one which is incompatible
     *  with some method invocations.
     *
     *  Checklist:
     *  1. Identify the interface that you need to follow
     *  2. Identify the type that you need to adapt
     *  3. Create adapter that implements target interface and aggregates type that you need to adapt. Wrapper class
     *  should have the reference to the adaptee class
     *  4. Instantiate adapter in your client code and just use it
     */

    public static void main(String[] args) {

        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "jasonsMusic.mp3");

        AdvancedMediaPlayerInterface mp4Player = new Mp4Player();
        MediaPlayerInterface advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "alone.mp4");

        AdvancedMediaPlayerInterface vlcPlayer = new VlcPlayer();
        MediaPlayerInterface advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "far far away.vlc");

        audioPlayer.play("vlc", "far far away.vlc");
    }
}
