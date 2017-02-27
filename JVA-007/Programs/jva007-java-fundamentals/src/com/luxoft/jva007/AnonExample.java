package com.luxoft.jva007;

/**
 * Created by Ihor Ruskykh on 2/27/2017.
 */
public class AnonExample {


    public static void main(String[] args){
        // local class
        class Flyer {
            void fly(){
                System.out.println("I can fly");
            }
        }

        Flyer f = new Flyer();
        f.fly();

        //anonymous class
        Flyer o = new Flyer(){
            void fly(){
                System.out.println("I can fly!");
            }
        };

        o.fly();
    }

}
