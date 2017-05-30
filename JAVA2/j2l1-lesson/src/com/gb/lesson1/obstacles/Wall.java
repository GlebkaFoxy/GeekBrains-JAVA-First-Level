package com.gb.lesson1.obstacles;

import com.gb.lesson1.animals.Animal;
import com.gb.lesson1.animals.Jumpable;

/**
 * Created by Gleb on 29.05.2017.
 */
public class Wall extends Obstacle {

    public Wall(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) {
        if (animal instanceof Jumpable) {
            Jumpable jumpableAnimal = (Jumpable) animal;
            jumpableAnimal.jump(getValue());
        } else {
            animal.crossFail();
        }
    }

    @Override
    public String toString() {
        return "стена";
    }
}
