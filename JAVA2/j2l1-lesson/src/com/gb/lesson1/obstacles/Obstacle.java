package com.gb.lesson1.obstacles;

import com.gb.lesson1.animals.Animal;

/**
 * Created by Gleb on 29.05.2017.
 *
 */
public abstract class Obstacle {
    private int value;

    public abstract void doIt(Animal animal);

    public Obstacle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
