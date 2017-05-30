import Animals.*;



/**
 * Created by user on 01.03.2017.
 *
 * 1.	Создать несколько классов: Собака, Лошадь, Кот - с наследованием от родительского класса Животное.
 * 2.	Все классы должны иметь возможность выполнять действия: бежать, плыть, перепрыгивать препятствие.
 * 3.	У каждого класса свои ограничения на каждое из действий(например, высота прыжка,
 * собака может перепрыгнуть максимум полуметровое препятствие, кот 1-2 метровое;
 * считаем что коты не умеют плавать и т.д.).
 * Каждое действие должно выводить результат в консоль(смогло животное выполнить действие, или нет).
 */
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("SSWW", 3, 0, 2);
        Dog dog = new Dog("Huston", 6, 5, 2);
        Hourse hourse = new Hourse("Barabara", 12 , 7, 5);


        System.out.println("Это котик "+cat.name);
        cat.Run();
        cat.Swim();
        cat.Jump();
        System.out.println();
        System.out.println("Это собачка "+dog.name);
        dog.Run();
        dog.Swim();
        dog.Jump();
        System.out.println();
        System.out.println("Это Лошадка "+hourse.name);
        hourse.Run();
        hourse.Swim();
        hourse.Jump();
    }
}












