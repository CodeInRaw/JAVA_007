package com.luxoft.jva007;

/**
 * Created by Ihor Ruskykh on 2/27/2017.
 */

interface Swimmer{
    void swimm();
}
public class AnonExample2 {
    public static void main(String[] args){
        Swimmer s = new Swimmer() {
            @Override
            public void swimm() {
                System.out.println("I can swim!");
            }
        };
        s.swimm();
    }
}

