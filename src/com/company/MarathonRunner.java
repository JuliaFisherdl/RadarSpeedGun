package com.company;

public class MarathonRunner extends Person implements Mover{
    private boolean hasRaced;
    public String name;

    public MarathonRunner(String name, boolean hasRaced){
        this.name = name;
        this.hasRaced = hasRaced;

    }
    @Override
    public double move(){
        setSpeed(5);
        System.out.println("The marathon runner is now running at " + getSpeed() + " mph.");
        return getSpeed();
    }
    @Override
    public void outputDetails(){
        super.outputDetails();
        System.out.println("Has runner ran in previous races? + hasRaced");
    }
}
