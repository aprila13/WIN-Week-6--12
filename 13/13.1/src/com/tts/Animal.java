package com.tts;

//An interface is a completely abstract class that is used to group related methods with empty bodies

public interface Animal {

    public void animalSound();
    public void run();
}

class Pig implements Animal{

    @Override
    public void animalSound() {
        System.out.println("OINK!");
    }

    @Override
    public void run() {
        System.out.println("Wobble!");
    }
}


