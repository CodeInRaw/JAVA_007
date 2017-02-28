package com.luxoft.jva007.Generic;

import java.util.ArrayList;

/**
 * Created by Ihor Ruskykh on 2/28/2017.
 */
public class GenericExample {
    public static void main(String[] args){
        //create list
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());

        Integer[] ints = {1, 2, 3};
        Integer first = getFirstElement(ints);
        Integer first2 = (Integer) getFirstElement2(ints);

       // printToConsole(list);
    }

    //using generic
    static <T> T getFirstElement(T[] arr) {
        return arr[0];
    }

    //using Object
    static Object getFirstElement2(Object[] arr) {
        return arr[0];
    }

/*
    static <T> void printToConsole(T arg) {
        System.out.println(arg.toString());
    }

    static <T> T printToConsole3(T arg) {
        System.out.println(arg.toString());
        return arg;
    }

    static void printToConsole2(Object o){
        System.out.println(o.toString());
    }
    */
}
