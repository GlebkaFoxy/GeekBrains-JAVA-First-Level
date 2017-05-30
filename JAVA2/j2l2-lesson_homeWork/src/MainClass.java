import animals.Animal;
import animals.Cat;
import animals.Duck;
import animals.Turtle;
import exceptions.CrossFailException;
import exceptions.FailException;
import obstacles.Cross;
import obstacles.Wall;
import obstacles.Water;
import obstacles.Obstacle;

/**
 * Created by Tim on 12.07.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Готовимся к старту...");

        Animal[] animals = new Animal[3];

        animals[0] = new Cat("Мурзик");
        animals[1] = new Duck("Квака");
        animals[2] = new Turtle("Череп");

        Obstacle[] objections = new Obstacle[3];

        objections[0] = new Cross(400); //бег на 400 метров
        objections[1] = new Wall(3); //трехметровая стена
        objections[2] = new Water(200); //200 метров вплавь

        System.out.println("Старт!");

        for (int i = 0; i < objections.length; i++) {
            Obstacle objection = objections[i];
            System.out.println("- Препятствие " + objection);
            for (int j = 0; j < animals.length; j++) {
                Animal animal = animals[j];
                if (animal.isOnDistance()) {
                    try {
                        objection.doIt(animal);
                    } catch (FailException e) {
                        System.out.println(e.getFailInfo());
                    }
                }
            }
        }

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if (animal.isOnDistance()) {
                System.out.println(animal.getName() + " ПОБЕДИЛ!!!");
            }
        }

    }
}
