package com.luxoft.jva007.ZoomExcercise.Zoom;

import com.luxoft.jva007.ZoomExcercise.Interfaces.Flyer;

/**
 * Created by Ihor Ruskykh on 2/22/2017.
 */
public class InsectUseConstructor extends Zoom implements Flyer{
    private int numberOfWings;
    private int numberOfLegs;

    @Override
    public void fly() {
        System.out.println("***************Flyer*************");
        System.out.println("My name is "+getName()+" and I can fly!");
        System.out.println("I have "+getNumberOfLegs()+" legs.");
        System.out.println("I have "+getNumberOfWings()+" wings");
    }

    @Override
    public void fly(int height, int distance) {
        fly();
        System.out.println("My height is : "+height+", and distance is : "+distance);
    }

    public int getNumberOfWings(){
        return this.numberOfWings;
    }

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }

    public InsectUseConstructor(){
        this.numberOfLegs = 6;
        this.numberOfWings = 2;
    }
    public InsectUseConstructor (int wings, int legs){
        this.numberOfWings = wings;
        this.numberOfLegs = legs;
    }
}
