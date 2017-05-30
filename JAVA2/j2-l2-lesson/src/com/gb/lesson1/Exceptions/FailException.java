package com.gb.lesson1.Exceptions;

/**
 * Created by user on 29.05.2017.
 */
public class FailException extends AppException {
    String nameAnimal;
    String nameObstacles;
    int valueObstacles;
    FailException(String nameAnimal,String nameObstacles, int valueObstacles){
       this.nameAnimal=nameAnimal;
        this.nameObstacles=nameObstacles;
        this.valueObstacles=valueObstacles;
    }

    String getFailInfo(String nameAnimal,String nameObstacles, int valueObstacles){
        return nameAnimal+" выбыл на препятствии "+nameObstacles+" размером: "+valueObstacles;
    }
}
