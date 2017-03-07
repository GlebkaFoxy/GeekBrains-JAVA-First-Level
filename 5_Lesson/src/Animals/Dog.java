package Animals;

/**
 * Created by user on 01.03.2017.
 */
public class Dog extends Animals {
    public    String name;

    int run;
    int swim;
    int jump;

    public Dog(String name, int run,int swim, int jump) {

        super(age);
        this.name=name;
        this.run=run;
        this.swim=swim;
        this.jump=jump;

    }


    public void Run(){
        super.Run(name,run);
    }
    public void Swim(){
        super.Swim(name ,swim);
    }
    public void Jump(){
        super.Jump(name,jump);
    }

}
