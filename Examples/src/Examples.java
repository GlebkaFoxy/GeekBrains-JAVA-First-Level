/**
 * Created by user on 26.02.2017.
 * Меня зовут Амиго.

 Я согласен на зарплату $800/месяц в первый год.
 Я согласен на зарплату $1500/месяц во второй год.
 Я согласен на зарплату $2200/месяц в третий год.
 Я согласен на зарплату $2700/месяц в четвертый год.
 Я согласен на зарплату $3200/месяц в пятый год.

 Поцелуй мой блестящий металлический зад!

 */
public class Examples {

    int age;
    private String name;


    public static void main(String[] args) {
        System.out.println("Я согласен на зарплату $800/месяц в первый год.");
        System.out.println("Я согласен на зарплату $1500/месяц во второй год.");
        System.out.println("Я согласен на зарплату $2200/месяц в третий год.");
        System.out.println("Я согласен на зарплату $2700/месяц в четвертый год.");
        System.out.println("Я согласен на зарплату $3200/месяц в пятый год.");
        //        metod_Privazki_Objects();
//
//        metod_Privazki_Peremennih();
//
//        createObject();

    }
     static void metod_Privazki_Peremennih(){
        int a=5,b=7;
        System.out.println(a+" "+b);

        b=a;
        System.out.println(a+" "+b);

        a= 16;
        System.out.println(a+" "+b);
        System.out.println();
    }
     static void metod_Privazki_Objects(){
        Examples c1 = new Examples("GiGi");
        c1.name="GiGi";

        Examples c2 = new Examples("TuTu");
        c2.name = "TuTu";

        System.out.println("Объект 1, имя: "+c1.name+"    Объект 2, имя: "+c2.name);

        c2=c1;
        System.out.println("Объект 1, имя: "+c1.name+"    Объект 2, имя: "+c2.name);

        c1.name="TeRe";
        System.out.println("Объект 1, имя: "+c1.name+"    Объект 2, имя: "+c2.name);
        System.out.println();
    }
    protected Examples(String _name){//Конструктор Класса и Объекта
       name=_name;


    }

    public int test(int ruffalo)// В (*) "Аргументы метода"
    {

        this.age=ruffalo;
        ruffalo=ruffalo*5;
        return ruffalo;
    }



    public static void createObject(){
        Examples c3 = new Examples("GG");
        System.out.println("Объект 3 имеет имя: "+c3.name);
        System.out.println("Объект 3 имеет возраст :"+c3.test(2));

    }



    public void setName(String name){ this.name= name;}
}
