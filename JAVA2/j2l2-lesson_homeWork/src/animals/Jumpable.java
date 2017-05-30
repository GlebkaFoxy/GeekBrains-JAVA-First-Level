package animals;

import exceptions.AnimalOutFromDistanceException;

/**
 * Created by Tim on 12.07.2016.
 */
public interface Jumpable {
    void jump(int height) throws AnimalOutFromDistanceException;
}
