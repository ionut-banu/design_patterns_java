package com.ionut.command;

import com.ionut.receiver.TV;

public class TVOnCommand implements Command{
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {

    }
}
