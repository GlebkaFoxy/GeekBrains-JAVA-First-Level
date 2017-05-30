package com.gb.lesson1.animals;

/**
 * Created by Gleb on 29.05.2017.
 */
public class Duck extends Animal implements Jumpable, Swimable, sightInDarck {

    private static final int MAX_CROSS_DIST = 500;

    private static final int MAX_JUMP_HEIGHT = 10;

    private static final int MAX_SWIM_DIST = 1000;

    private static final int MAX_DARCK = 10;


    public Duck(String name) {
        super(name, Duck.MAX_CROSS_DIST);
    }

    @Override
    public void seeInDark (int darck) {
        if(darck < Duck.MAX_DARCK) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }


    @Override
    public void jump(int height) {
        if(height < Duck.MAX_JUMP_HEIGHT) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    @Override
    public void swim(int dist) {
        if(dist < Duck.MAX_SWIM_DIST) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    @Override
    public String toString() {
        return "Утка " + getName();
    }

}
