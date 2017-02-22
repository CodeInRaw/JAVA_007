package com.luxoft.jva007.ZoomExcercise.Main;
import com.luxoft.jva007.ZoomExcercise.Zoom.*;

/**
 * Created by Ihor Ruskykh on 2/22/2017.
 */
public class Main {
    public static void main(String[] args){
        Fish fish1 = new Fish();
        Insect insect1 = new Insect();

        fish1.setName("Nemo");
        //fish1.setDistance(54);
        fish1.setBoned(true);
        fish1.setSeaFish(true);
        fish1.swimm();

        insect1.setName("Birdy");
        insect1.setNumberOfLegs(4);
        insect1.setNumberOfWings(2);
        insect1.fly(55, 3);

        FishUseConstructor fishUseConstructor = new FishUseConstructor(true, true);
        System.out.println(fishUseConstructor.getSeaFish());
        System.out.println(fishUseConstructor.getBoned());

        InsectUseConstructor insectUseConstructor = new InsectUseConstructor(2, 6);
        System.out.println("wings : "+insectUseConstructor.getNumberOfWings());
        System.out.println("legs  : "+insectUseConstructor.getNumberOfLegs());
        System.out.println(new InsectUseConstructor().getNumberOfWings());
    }
}
