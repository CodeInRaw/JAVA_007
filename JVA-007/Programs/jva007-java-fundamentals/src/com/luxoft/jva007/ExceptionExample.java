package com.luxoft.jva007;

/**
 * Created by ptcvas13 on 2/28/2017.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Clean room");
        starpom();
        System.out.println("OK!");
    }

    static void starpom(){
        System.out.println("Starpom: Clean room");
        bocman();
        System.out.println("Starpom: Room is OK!");
    }

    static void bocman(){
        System.out.println("Bocamn: Clean room");
        try {
            matros();
        }
        catch (ArithmeticException e){
            System.out.println("Hide the model");
        }
        System.out.println("Bocamn: Room is OK!");
    }

    static void matros(){
        System.out.println("Matros: Clean room");
        junga();
        System.out.println("Matros: Room is OK!");
    }

    static void junga(){
        int a = 10/0;
        System.out.println("Room is OK!");
    }
}
