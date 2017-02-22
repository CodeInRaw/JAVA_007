package com.luxoft.jva007.ZoomExcercise.Zoom;

import com.luxoft.jva007.ZoomExcercise.Interfaces.Swimmer;

/**
 * Created by ptcvas13 on 2/22/2017.
 */
public class FishUseConstructor extends Zoom implements Swimmer{
    private boolean seaFish;
    private boolean boned;

    public FishUseConstructor(boolean boned, boolean seaFish){
        this.boned = boned;
        this.seaFish = seaFish;
    }

    @Override
    public void swimm(){
        swimm(5);
    }

    @Override
    public void swimm(int distance) {
        System.out.println("******************Swimmer*****************");
        System.out.println("My name is "+getName()+" and I can swimm!");
        System.out.println("I have bones : "+getBoned());
        System.out.println("I'm from the sea : "+getSeaFish());
        System.out.println("I am swimmed "+distance+" kilometers :)");
    }

    public boolean getSeaFish(){
        return this.seaFish;
    }

    public boolean getBoned(){
        return this.boned;
    }


}
