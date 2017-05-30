package obstacles;

import animals.Animal;
import animals.Jumpable;
import exceptions.AnimalOutFromDistanceException;
import exceptions.WallFailException;

/**
 * Created by Tim on 12.07.2016.
 */
public class Wall extends Obstacle {

    public Wall(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) throws WallFailException {
        try {
            if (animal instanceof Jumpable) {
                Jumpable jumpableAnimal = (Jumpable) animal;
                jumpableAnimal.jump(getValue());
            } else {
                animal.crossFail();
            }
        } catch (AnimalOutFromDistanceException e) {
            throw new WallFailException(animal.toString(), getValue());
        }
    }

    @Override
    public String toString() {
        return "стена";
    }
}
