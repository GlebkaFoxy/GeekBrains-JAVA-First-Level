package exceptions;

public class FailException extends Exception {
    private String animalName;
    private String obstacleName;
    private int obstacleValue;

    public FailException(String animalName, String obstacleName, int obstacleValue) {
        this.animalName = animalName;
        this.obstacleName = obstacleName;
        this.obstacleValue = obstacleValue;
    }

    public String getFailInfo() {
        return animalName + " выбыл на препятствии \""
                + obstacleName + "\" величиной = " + obstacleValue;
    }
}
