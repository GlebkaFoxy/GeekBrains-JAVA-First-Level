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
        int checkValue =7;


        Animals[] animals= new Animals[3];
        animals [1] = new Cat("Dinge",7);
        animals [2] = new Dog("Gorge",5);
        animals [0] = new Hourse("Arue",12);
        System.out.println("Что-то");
        for (int i=0;i<animals.length;i++){
            if (Animals.age<checkValue){
                System.out.println(Animals.name+" Проиграл");
            }else {
                System.out.println(Animals.name+" Перепрыгнул");
            }
        }

    }
}


