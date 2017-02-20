package com.luxoft.jva007;

/**
 * Created by Ihor Ruskykh on 2/20/2017.
 */
public class PrimitiveExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c;
        c = foo(a, b);
        // in the output a = 5; b = 10; c = 25;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        int[] nums  = new int[3];
        boo(nums);
        //output will be number 10
        System.out.println(nums[1]);
    }

    static int foo(int x, int y){
        x = 15;
        int r = x + y;
        return r;
    }

    static void boo(int[] ints){
        ints[1] = 10;
    }
}
