package com.luxoft.jva007.Generic;

/**
 * Created by ptcvas13 on 2/28/2017.
 */
public class GenericExample2 {
    public static void main(String[] args) {
        Cage<Dog> c = new Cage<>();
        c.put(new Dog("Sharik"));
        Dog a = c.free();
        //Animal a = c.free();
        //((Dog) a).woof();
        a.woof();

        Cage<Duck> c2 = new Cage<>();
        c2.put(new Duck("Donald"));
        //Animal a2 = c2.free();
        //((Duck) a2).fly();
        c2.free().fly();
    }

    static class Cage<T extends Animal> {
        T animal;

        void put(T a){
            animal = a;
        }

        T free() {
            T a = animal;
            animal = null;
            return a;
        }
    }
}
