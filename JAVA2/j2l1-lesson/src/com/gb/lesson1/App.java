package com.gb.lesson1;

import com.gb.lesson1.animals.*;
import com.gb.lesson1.obstacles.*;

/**
 * Created by Tim on 12.07.2016.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Готовимся к старту...");
        System.out.println();

        Animal[] animals = new Animal[4];

        animals[0] = new Cat("Мурзик");
        animals[1] = new Duck("Квака");
        animals[2] = new Turtle("Череп");
        animals[3] = new Owl("Кумарка");

        Obstacle[] obstacles = new Obstacle[4];

        obstacles[0] = new Cross(400); //бег на 400 метров
        obstacles[1] = new Darck (50); //50% Зрение в темноте
        obstacles[2] = new Wall(3); //трехметровая стена
        obstacles[3] = new Water(200);//200 метров вплавь

        System.out.println("Старт!");

        for (int i = 0; i < obstacles.length; i++) {
            Obstacle obstacle = obstacles[i];
            System.out.println();
            System.out.println("- Препятствие " + obstacle);
            for (int j = 0; j < animals.length; j++) {
                Animal animal = animals[j];
                if (animal.isOnDistance()) {
                    obstacle.doIt(animal);
                }

            }
        }

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if (animal.isOnDistance()) {
                System.out.println();
                System.out.println(animal.getName() + " ФИНИШИРОВАЛ!!!");
            }
        }

    }
}
