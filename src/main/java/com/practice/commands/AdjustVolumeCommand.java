package com.practice.commands;

import com.practice.devices.Speaker;

// Concrete command for adjusting the volume of a stereo
public class AdjustVolumeCommand implements Command {
    private Speaker speaker;

    public AdjustVolumeCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.adjustVolume();
    }
}
