package com.example.designpattern.command;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/6
 */
public interface Command {
    public void execute();

    public void undo();
}
