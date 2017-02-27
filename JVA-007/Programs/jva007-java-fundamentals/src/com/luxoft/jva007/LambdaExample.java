package com.luxoft.jva007;

/**
 * Created by Ihor Ruskykh on 2/27/2017.
 */
public class LambdaExample {
    public static void main(String[] args){
        //call the doSmth method
        doTriple(new ImplementSmth() {
            @Override
            public void doSmth(int i) {
                System.out.println("Hello " + i + "!");
            }
        });
        //lambda expression
        doTriple(i -> System.out.println("Hello lambda " + i + "!"));
    }

    static void doTriple(ImplementSmth obj) {
        obj.doSmth(1);
        obj.doSmth(2);
        obj.doSmth(3);
    }

    interface ImplementSmth {
        void doSmth(int i);
    }
}
