package com.smart.home.command;
import com.smart.home.model.Device;

public interface Command {
    void execute();
    void undo();
}