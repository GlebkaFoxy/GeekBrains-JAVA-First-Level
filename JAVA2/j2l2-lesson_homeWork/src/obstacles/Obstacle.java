package obstacles;

import animals.Animal;
import exceptions.CrossFailException;
import exceptions.WallFailException;

/**
 * Created by Tim on 12.07.2016.
 */
public abstract class Obstacle {
    private int value;
    public abstract void doIt(Animal animal) throws CrossFailException, WallFailException;

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
