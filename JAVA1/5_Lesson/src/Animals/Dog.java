package Animals;

import Test.DoClass;

/**
 * Created by user on 01.03.2017.
 */
public class Dog extends Animals {


    public Dog(String name, int run, int swim, int jump){
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
