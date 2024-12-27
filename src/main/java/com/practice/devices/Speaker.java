package com.practice.devices;

import com.practice.devices.Device;

public class Speaker implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off TV");
    }

    public void adjustVolume() {
        System.out.println("Adjusting volume in speaker");
    }
}
