package Animals;

/**
 * Created by user on 06.03.2017.
 */
public class Cat extends Animals {
public String name;

int run;
int swim;
int jump;

    public Cat(String name, int run,int swim, int jump) {

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