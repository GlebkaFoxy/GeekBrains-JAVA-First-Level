package Animals;



/**
 * Created by user on 01.03.2017.
 */
public abstract class Animals  {
    String name;
    final int age=5;
    int run;
    int swim;
    int jump;



    public Animals(String name, int run, int swim, int jump) {

        this.name=name;

        this.run=run;
        this.swim=swim;
        this.jump=jump;

    }


    void Swim(String name, int swim){
        if(swim < 1){
            System.out.println(name+" Утонул");
        }
        if (swim >= 1 && swim < 4) {
            System.out.println(name+" хорошо плывём");
        }
        if(swim > 4) {
            System.out.println(name+" Очень быстро плывёт");
        }
    }

    void Jump(String name, int jump){
        if(jump < 1){
            System.out.println(name+" не перепрыгнет препятствие");
        }if (jump >= 1 && jump <= 2){
            System.out.println(name+" перепрыгнет препятствие");
        }if(jump > 2){
            System.out.println(name+" перепрыгнет высокое препятствие");}
    }

    public void Run(String name, int run) {
        if(run<5){
            System.out.println(name+" Медленно бежит");
        }if (run >= 5 && run <=9){
            System.out.println(name+" Хорошая скорость");
        }if(run>9){
            System.out.println(name+" Очень быстрый");}
    }

}


