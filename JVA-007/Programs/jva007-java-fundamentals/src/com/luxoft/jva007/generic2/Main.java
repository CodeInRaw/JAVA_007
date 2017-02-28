package com.luxoft.jva007.generic2;

import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ptcvas13 on 2/28/2017.
 */
public class Main {

    public static void main(String[] args) {
/*
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        System.out.println(shapes.size());

        for (Shape s :shapes){
            if (s instanceof Triangle) System.out.println("Triangle");
            else if (s instanceof Circle) System.out.println("Circle");
            else System.out.println("shape");
        }
        */

        /*
        addCircle(new ArrayList<Shape>());
        addCircle(new ArrayList<Triangle>());
*/


        Map<String, Shape> shapes = new HashMap<>();
        shapes.put("circle", new Circle());
        shapes.put("triangle", new Triangle());

        Shape s = shapes.get("triangle");
        System.out.println(s);
    }
/*
    static void addCircle(List<? extends Shape> list){
        list.add(new Circle());
    }
*/
    static class Shape {}

    static class Circle extends Shape {}
    static class Triangle extends Shape {}

}
