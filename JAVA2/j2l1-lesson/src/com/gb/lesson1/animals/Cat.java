package com.gb.lesson1.animals;

/**
 * Created by Tim on 12.07.2016.
 */
public class Cat extends Animal {

    private static final int MAX_CROSS_DIST = 1000;





    public Cat(String name) {
        super(name, Cat.MAX_CROSS_DIST);
    }










    @Override
    public String toString() {
        return "Кот " + getName();
    }
}
