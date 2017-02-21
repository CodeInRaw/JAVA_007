package com.luxoft.jva007;

/**
 * Created by Ihor Ruskykh on 2/21/2017.
 */
public class BitShiftExample {
    public static void main(String[] args){
        int mask = 0xFF000000;
        int i = mask >> 16;
        int j = mask >> 24;
        int k = mask >> 32;
        System.out.println("i = " + Integer.toHexString(i));
        System.out.println("j = " + Integer.toHexString(j));
        System.out.println("k = " + Integer.toHexString(k));

        int m = ~0;
        m >>>= 1;
        int n = ~m;
        System.out.println(n);
    }
}
