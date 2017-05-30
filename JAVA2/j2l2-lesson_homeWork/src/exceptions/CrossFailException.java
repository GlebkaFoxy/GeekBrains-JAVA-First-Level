package exceptions;

public class CrossFailException extends FailException {
    public static final String OBSTACLE_NAME = "бег на дистанцию";

    public CrossFailException(String animalName, int obstacleValue) {
        super(animalName, OBSTACLE_NAME, obstacleValue);
    }
}
