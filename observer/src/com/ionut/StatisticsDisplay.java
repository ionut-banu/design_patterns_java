package com.ionut;

public class StatisticsDisplay implements Observer {
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Statistic: temp: " + temp + " humidity: " + humidity + " pressure: " + pressure);
    }
}
