package com.ionut.receiver;

public class Stereo {
    public void on() {
        System.out.println("Stereo is On");
    }

    public void off() {
        System.out.println("Stereo is Off");
    }

    public void setCD() {
        System.out.println("Stereo is set to CD");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume is set to " + volume);
    }
}
