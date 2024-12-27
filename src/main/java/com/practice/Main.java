package com.practice;

import com.practice.commands.AdjustVolumeCommand;
import com.practice.commands.ChangeChannelCommand;
import com.practice.commands.Command;
import com.practice.commands.TurnOnCommand;
import com.practice.devices.Speaker;
import com.practice.devices.Tv;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Command adjustVolume = new AdjustVolumeCommand(new Speaker());
        Command changeChannel = new ChangeChannelCommand(new Tv());
        Command turnOnTv = new TurnOnCommand(new Tv());

        RemoteControl remoteControl = new RemoteControl(adjustVolume);

        remoteControl.setCommand(adjustVolume);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOnTv);
        remoteControl.pressButton();

    }
}