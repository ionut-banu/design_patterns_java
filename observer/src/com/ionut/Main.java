package com.ionut;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(10, 1.02f, 0.54f);
        weatherData.setMeasurements(11, 1.03f, 0.55f);
    }
}
