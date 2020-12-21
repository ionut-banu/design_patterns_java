package com.ionut;

import com.ionut.command.*;
import com.ionut.receiver.*;
import com.ionut.remote.RemoteControl;

public class Main {

    public static void main(String[] args) {
        // Part One
        /*SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light("");
        Command lightOn = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        Command garageOpen = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommand(garageOpen);
        simpleRemoteControl.buttonWasPressed();*/

        // Part Two
        /*RemoteControl remoteControl = new RemoteControl();
        System.out.println(remoteControl.toString());

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("KitchenLight");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);*/

        // Part Three
        /*RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControlWithUndo.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo.toString());
        remoteControlWithUndo.undoButtonWasPushed();*/

        // Part Four
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo();
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("---Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);

    }
}
