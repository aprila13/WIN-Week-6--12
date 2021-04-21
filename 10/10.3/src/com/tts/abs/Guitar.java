package com.tts.abs;

public class Guitar extends Instrument {

    @Override
    public boolean isThisAnInstrument(boolean value) {
        return false;
    }

    @Override
    public void createSound() {
        System.out.println("strum sound");
    }
}
