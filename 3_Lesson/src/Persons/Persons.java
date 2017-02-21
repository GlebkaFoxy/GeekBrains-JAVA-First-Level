package Persons;

import java.util.Scanner;

/**
 * Created by user on 08.02.2017.
 */
public class Persons {
    public static void main(String[] args) {
   Person person = new Person("FFFe");
        Cat cat = new Cat(person);
        System.out.println(cat.owner.name);



    }
   public static class Cat{
     public Person owner;
       public Cat(Person owner){this.owner=owner;}
    }


  public  static class Person {
public String name;
      public Person(String name){this.name= name;}
    }

}





