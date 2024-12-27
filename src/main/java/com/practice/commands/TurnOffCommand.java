package com.practice.commands;

import com.practice.devices.Device;

public class TurnOffCommand implements Command {
    private Device device;

    @Override
    public void execute() {
        device.turnOff();
    }
}
