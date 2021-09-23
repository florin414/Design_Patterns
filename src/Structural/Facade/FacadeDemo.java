package Structural.Facade;

public class FacadeDemo {

    /**
     * This design pattern allows us to create a class which takes care of the objects calls
     * so the client doesn't need to make them itself. In this way, the system is simplified
     * and the 'facade' methods help us to make higher level calls.
     *
     * Checklist:
     * 1. Define business cases and business scenarios that are most used in your app.
     * 2. Design a facade interface that describes behaviour to interact with subsystems.
     * 3. Aggregate all necessary types inside the facade to ensure efficient and proper
     * behaviour of facade
     * 4. In client code get instance of facade and work with it.
     */

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd,
                projector, screen, lights, popper);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
