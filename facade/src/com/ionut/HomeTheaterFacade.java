package com.ionut;

import com.ionut.components.*;

public class HomeTheaterFacade {
    Amplifier amp;
    DvdPlayer dvdPlayer;
    PopcornPopper popper;
    TheaterLights lights;
    TheaterScreen screen;
    Projector projector;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvdPlayer, PopcornPopper popper, TheaterLights lights, TheaterScreen screen, Projector projector) {
        this.amp = amp;
        this.dvdPlayer = dvdPlayer;
        this.popper = popper;
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
