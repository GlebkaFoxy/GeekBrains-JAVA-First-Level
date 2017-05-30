package animals;

import exceptions.AnimalOutFromDistanceException;

/**
 * Created by Tim on 12.07.2016.
 */
public abstract class Animal {
    private String name;
    private boolean onDistance;
    private int maxDistance;

    protected Animal(String name, int maxDistance) {
        this.name = name;
        this.onDistance = true;
        this.maxDistance = maxDistance;
    }

    public void cross(int value) throws AnimalOutFromDistanceException {
        if (value <= maxDistance) {
            System.out.println(name + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void crossFail() throws AnimalOutFromDistanceException {
        setOnDistance(false);
        throw new AnimalOutFromDistanceException();
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
