package com.ionut;

public class ForecastDisplay implements Observer {
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Forecast: temp: " + temp + " humidity: " + humidity + " pressure: " + pressure);
    }
}
