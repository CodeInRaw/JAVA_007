package com.luxoft.jva007;

/**
 * Created by Ihor Ruskykh on 2/27/2017.
 */
class Swimer{
    Swimer(String name){
        System.out.println(name);
    }

    Swimer(int age){}
}

public class AnonExample3 {
    public static void main(String[] args){
        Swimer s = new Swimer("Alex"){
            public void swim(){
                System.out.println("I can swim!");
            }
        };
    }
}
