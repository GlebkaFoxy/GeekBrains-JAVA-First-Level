package com.gb.lesson1.animals;

/**
 * Created by Gleb on 29.05.2017.
 */
public class Cat extends Animal implements Jumpable {

    private static final int MAX_CROSS_DIST = 1000;

    private static final int MAX_HEIGHT = 2;

    private static final int MAX_DARCK = 60;



    public Cat(String name) {
        super(name, Cat.MAX_CROSS_DIST);
    }






    @Override
    public void jump(int height) {
        if(height < Cat.MAX_HEIGHT) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }



    @Override
    public String toString() {
        return "Кот " + getName();
    }
}
