package exceptions;

public class WallFailException extends FailException {
    public static final String OBSTACLE_NAME = "стена";

    public WallFailException(String animalName, int obstacleValue) {
        super(animalName, OBSTACLE_NAME, obstacleValue);
    }
}
