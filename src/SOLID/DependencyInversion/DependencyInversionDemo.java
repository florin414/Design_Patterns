package SOLID.DependencyInversion;

public class DependencyInversionDemo {

    public static void main(String[] args) {
        WeatherAggregator weatherAggregator = new WeatherAggregator(new AccuweatherApi(), new BbcWeatherApi());

        System.out.println(weatherAggregator.getTemperature());
    }
}