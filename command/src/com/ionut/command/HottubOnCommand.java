package com.ionut.command;

import com.ionut.receiver.Hottub;

public class HottubOnCommand implements Command{
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {

    }
}
