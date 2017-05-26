package doItAgain.obstacles;

/**
 * Created by user on 26.05.2017.
 */
public class Cross extends Obstacle {
   private Boolean plus;


    @Override
    public void cross(int CROSS_DISTANSE, int Long, String name) {
        if (CROSS_DISTANSE<Long){
            System.out.println(name+" прошёл дистанцию");
        } else {
            System.out.println(name+" Не прошёл дистанцию");
            plus=true;
        }
    }




}
