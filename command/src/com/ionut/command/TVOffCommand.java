package com.ionut.command;

import com.ionut.receiver.TV;

public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {

    }
}
