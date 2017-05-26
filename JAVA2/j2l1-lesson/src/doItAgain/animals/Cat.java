package doItAgain.animals;

/**
 * Created by user on 26.05.2017.
 */
public class Cat extends Animal {
    private int CROSS_DISTANSE;
    private String name;
    public Cat(String name, int age, int CROSS_DISTANSE){
        super(age);
        this.CROSS_DISTANSE=CROSS_DISTANSE;
        this.name=name;
    }



}
