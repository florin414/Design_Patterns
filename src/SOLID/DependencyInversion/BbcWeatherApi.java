package SOLID.DependencyInversion;

public class BbcWeatherApi implements WeatherSource {

    @Override
    public double getTemperatureCelsius() {
        return 28;
    }
}