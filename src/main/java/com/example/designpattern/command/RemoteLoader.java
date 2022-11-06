package com.example.designpattern.command;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0, lightOffCommand, lightOnCommand);

        Command[] partyOn = {lightOffCommand, lightOnCommand};
        Command[] partyOff = {lightOnCommand, lightOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(1, partyOffMacro, partyOnMacro);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
    }
}
