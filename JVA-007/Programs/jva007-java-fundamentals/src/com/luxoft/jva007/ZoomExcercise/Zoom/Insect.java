package com.luxoft.jva007.ZoomExcercise.Zoom;

import com.luxoft.jva007.ZoomExcercise.Interfaces.Flyer;

/**
 * Created by Ihor Ruskykh on 2/22/2017.
 */
public class Insect extends Zoom implements Flyer {
    private int numberOfWings;
    private int numberOfLegs;

    @Override
    public void fly() {
        System.out.println("***************Flyer*************");
        System.out.println("My name is "+getName()+" and I can fly!");
        System.out.println("I have "+getGetNumberOfLegs()+" legs.");
        System.out.println("I have "+getNumberOfWings()+" wings");
    }

    @Override
    public void fly(int height, int distance) {
        fly();
        System.out.println("My height is : "+height+", and distance is : "+distance);
    }

    public int getNumberOfWings(){
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings){
        this.numberOfWings = numberOfWings;
    }

    public int getGetNumberOfLegs(){
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }



}
