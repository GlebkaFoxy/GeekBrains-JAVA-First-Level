package obstacles;

import animals.Animal;
import animals.Swimable;
import exceptions.AnimalOutFromDistanceException;
import exceptions.WallFailException;

/**
 * Created by Tim on 13.07.2016.
 */
public class Water extends Obstacle {

    public Water(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) throws WallFailException {
        try {
            if (animal instanceof Swimable) {
                Swimable swimableAnimal = (Swimable) animal;
                swimableAnimal.swim(getValue());
            } else {
                animal.crossFail();
            }
        } catch (AnimalOutFromDistanceException e) {
            throw new WallFailException(animal.toString(), getValue());
        }
    }

    @Override
    public String toString() {
        return "вода";
    }
}
