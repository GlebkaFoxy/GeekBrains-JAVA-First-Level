package Animals;

import sun.applet.Main;

/**
 * Created by user on 01.03.2017.
 */
public class Animals extends Main {
   protected String kindOfAnimal;
    protected  String name;
    protected  int age;
    protected   int run;
    protected  int swim;
    protected  int jump;

Animals (String kindOfAnimal, String name, int age, int run, int swim, int jump){
        this.kindOfAnimal=kindOfAnimal;
        this.name=name;
        this.age=age;
        this.run=run;
        this.swim=swim;
        this.jump=jump;
}

Animals(int run){
    this.run=run;

    static void Run(){

        if (run<5){
            System.out.println("Бежит медленно");
        }if (run>5 && run<9){
            System.out.println("Нормальная скорость бега");
        }if (run>=9){
            System.out.println("очень быстр");
        }
    }
}




}
