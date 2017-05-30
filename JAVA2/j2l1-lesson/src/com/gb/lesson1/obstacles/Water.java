package com.gb.lesson1.obstacles;

import com.gb.lesson1.animals.Animal;
import com.gb.lesson1.animals.Swimable;

/**
 * Created by Gleb on 29.05.2017.
 */
public class Water extends Obstacle {

    public Water(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) {
        if (animal instanceof Swimable) {
            Swimable swimableAnimal = (Swimable) animal;
            swimableAnimal.swim(getValue());
        } else {
            animal.crossFail();
        }
    }

    @Override
    public String toString() {
        return "вода";
    }
}
