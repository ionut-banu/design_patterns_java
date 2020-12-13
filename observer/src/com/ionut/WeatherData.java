package com.ionut;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    float temp = 0;
    float pressure = 0;
    float humidity = 0;

    List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    public void setMeasurements(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList)
            observer.update(temp, pressure, humidity);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

}
