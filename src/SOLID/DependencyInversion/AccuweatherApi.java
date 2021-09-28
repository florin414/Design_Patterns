package SOLID.DependencyInversion;

public class AccuweatherApi implements WeatherSource {

    @Override
    public double getTemperatureCelsius() {
        return 30;
    }

}