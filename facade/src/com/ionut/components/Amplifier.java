package com.ionut.components;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Amplifier setting DVD player to " + dvdPlayer);
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setting surround sound on");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier setting volume to " + volume);
    }
}
