package com.ionut.receiver;

public class TV {
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("TV is On");
    }

    public void off() {
        System.out.println("TV is Off");
    }
}
