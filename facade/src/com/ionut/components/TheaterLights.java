package com.ionut.components;

public class TheaterLights {
    public void on() {
        System.out.println("Theater Lights on");
    }

    public void off() {
        System.out.println("TheaterLights off");
    }

    public void dim(int intensity) {
        System.out.println("Theater Lights dimming to " + intensity + "%");
    }
}
