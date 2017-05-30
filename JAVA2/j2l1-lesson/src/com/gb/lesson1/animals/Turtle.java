package com.gb.lesson1.animals;

/**
 * Created by Gleb on 29.05.2017.
 */
public class Turtle extends Animal {

    private static final int MAX_CROSS_DIST = 50;

    private static final int MAX_DARCK = 30;

    public Turtle(String name) {
        super(name, Turtle.MAX_CROSS_DIST);
    }

    @Override
    public String toString() {
        return "Черепаха " + getName();
    }

}
