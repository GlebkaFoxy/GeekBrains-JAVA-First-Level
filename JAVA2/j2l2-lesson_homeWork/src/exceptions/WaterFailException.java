package exceptions;

public class WaterFailException extends FailException {
    public static final String OBSTACLE_NAME = "вода";

    public WaterFailException(String animalName, int obstacleValue) {
        super(animalName, OBSTACLE_NAME, obstacleValue);
    }
}
