package com.company;

public class Cheetah extends Animal implements Mover {

    private boolean hasInjury;
    private String name;

    public Cheetah(String name, boolean hasInjury) {
        this.name= name;
        this.hasInjury = hasInjury;

    }

    @Override
    public double move() {
        setSpeed(10);
        System.out.println("The Cheetah" + name + "is now moving at " + getSpeed());
        return getSpeed();

    }

    @Override
    public void outputDetails() {
        System.out.println("Is cheetah injured? " + hasInjury);

    }
}