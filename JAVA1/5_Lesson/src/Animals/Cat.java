package Animals;

/**
 * Created by user on 06.03.2017.
 */
public class Cat extends Animals {



    public Cat(String name, int run, int swim, int jump){
        super(name,run,swim,jump);

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