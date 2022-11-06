package com.example.designpattern.command;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}