package com.company;

public class Animal implements Mover{

    private double speed;

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    @Override
    public double move(){
        speed = 10;
        System.out.println("The animal is now moving at a default speed of "+ getSpeed () + " mph.");
        return speed;
    }

    @Override
    public void outputDetails(){
        System.out.println("This animal is moving at "+speed+" mph.");
    }

}
