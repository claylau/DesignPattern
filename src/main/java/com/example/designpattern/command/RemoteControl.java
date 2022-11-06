package com.example.designpattern.command;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class RemoteControl {
    Command[] offCommands;
    Command[] onCommands;
    Command undoCommand;

    private static final int slotNumner = 5;

    public RemoteControl() {
        offCommands = new Command[slotNumner];
        onCommands = new Command[slotNumner];
        Command noCommand = new NoCommand();
        for (int i = 0; i < slotNumner; i++) {
            offCommands[0] = noCommand;
            onCommands[0] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command offCommand, Command onCommand) {
        offCommands[slot] = offCommand;
        onCommands[slot] = onCommand;
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed(int slot) {
        undoCommand.undo();
    }
}
