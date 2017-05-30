package obstacles;

import animals.Animal;
import exceptions.AnimalOutFromDistanceException;
import exceptions.CrossFailException;

/**
 * Created by Tim on 12.07.2016.
 */
public class Cross extends Obstacle {

    public Cross(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) throws CrossFailException {
        try {
            animal.cross(getValue());
        } catch (AnimalOutFromDistanceException e) {
            throw new CrossFailException(animal.toString(), getValue());
        }
    }

    @Override
    public String toString() {
        return "бег на дистанцию";
    }
}
