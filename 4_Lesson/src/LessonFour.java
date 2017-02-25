import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion;

/**
 * Created by user on 25.02.2017.
 *
 * 1.	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * 2.	Конструктор класса должен заполнять эти поля при создании объекта;
 * 3.	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * 4.	Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

 */
public class LessonFour {

    public static void main(String[] args) {
        Mass();
    }


    public static void Mass(){
        Person[] persons= new Person[5];

        persons[1]= new Person("Vas", "Gater", "22@33","+744942",40003,43);
        persons[2]= new Person("Reew", "ssater", "22@33","+744942",40003,23);
        persons[3]= new Person("ffee", "Gater", "22@33","+744942",40003,54);
        persons[4]= new Person("asdf", "Gater", "22@33","+744942",40003,40);
        persons[0]= new Person("Vwwwq", "Gater", "22@33","+744942",40003,32);


        for (int a=0; a<persons.length;a++){
            if (persons[a].age>=40){
                System.out.println("Имя сотрудника "+persons[a].name+" Зарплата "+ persons[a].salary);
            }
        }
    }


 public static class Person{
     String name;
     String dolg;
     String email;
     String number;
     int salary;
     int age;



     public  Person(String name, String dolg, String email, String number, int salary, int age){
         this.name=name;
         this.dolg=dolg;
         this.email=email;
         this.number=number;
         this.salary=salary;
         this.age=age;
     }

 }
}
