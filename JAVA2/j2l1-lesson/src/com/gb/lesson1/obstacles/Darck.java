package com.gb.lesson1.obstacles;

import com.gb.lesson1.animals.Animal;

import com.gb.lesson1.animals.sightInDarck;

/**
 * Created by Gleb on 29.05.2017.
 */
public class Darck extends Obstacle {
    public Darck (int value){super(value);}

    @Override
    public void doIt(Animal animal) {
        if (animal instanceof sightInDarck){
            sightInDarck darcknessAnimal = (sightInDarck) animal;
            darcknessAnimal.seeInDark(getValue());
        } else {animal.crossFail();}

    }

    @Override
    public String toString() {
        return "Ночная стена";
    }
}

