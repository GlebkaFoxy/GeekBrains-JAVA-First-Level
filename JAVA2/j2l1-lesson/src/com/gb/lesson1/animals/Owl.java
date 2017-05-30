package com.gb.lesson1.animals;

/**
 * Created by Gleb on 29.05.2017.
 */
public class Owl extends Animal implements Swimable, Jumpable, sightInDarck {
    private static final int MAX_CROSS_DIST = 400;

    private static final int MAX_JUMP_HEIGHT = 10;

    private static final int MAX_SWIM_DIST = 500;

    private static final int MAX_DARCK = 100;


    public Owl (String name){super(name, Owl.MAX_CROSS_DIST);}

    @Override
    public void seeInDark (int darck) {
        if(darck < Owl.MAX_DARCK) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    @Override
    public void jump(int height) {
        if(height < Owl.MAX_JUMP_HEIGHT) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    @Override
    public void swim(int dist) {
        if(dist < Owl.MAX_SWIM_DIST) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    @Override
    public String toString() {
        return "Сова " + getName();
    }


    }

