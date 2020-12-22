package com.ionut;

import com.ionut.components.*;

public class Main {

    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        TheaterScreen screen = new TheaterScreen();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, dvdPlayer, popper, lights, screen, projector);

        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}
