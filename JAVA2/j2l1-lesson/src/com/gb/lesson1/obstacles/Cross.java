package com.gb.lesson1.obstacles;

import com.gb.lesson1.animals.Animal;

/**
 * Created by Gleb on 29.05.2017.
 */
public class Cross extends Obstacle {

    public Cross(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) {
        animal.cross(getValue());
    }

    @Override
    public String toString() {
        return "бег на дистанцию";
    }
}
