/**
 * Created by Bezginov.Gleb on 23.01.2017.
 * Задание:
 * 1.	Создать пустой проект в IntelliJ IDEA и прописать метод main();
 * 2.	Создать переменные всех пройденных типов данных, и инициализировать их значения;
 * 3.	Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.
 * 4.	Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20, если да – вернуть true,
 * в противном случае – false.
 * 5.	Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным,
 * кроме каждого 100-го, при этом каждый 400-й – високосный.
 *
 */
public class Main {
    public static void main(String[] args) {
        // Примитивные переменные

        //Целочисленные
        // byte, память 8 бит, значения от -128 до 127
        byte Byte = 1;

        // short, память 16 бит, значения от -32768 до 32767
        short Short = 2;

        // int, память 32 бит, значения от -2147483648 до 2147483647
        int Int = 3;

        //long, память 64 бит, значения от -9223372036854775808 до 9223372036854775807
        long Long = 4;

        //Дробные
        //float, память 32 бита.
        float Float = 5.0f;

        //double, память 64 бита.
        double Double = 6.0d;

        //char, память 16 бит, хранится в формате юникод
        char Char =7;

        // Принимает значение true или false
        boolean Bolean = true;

        System.out.println("Ответ третьего задания: "+doThirdTask(2,1,8,4));
        System.out.println();
        doFourthTask();
        System.out.println();
        doFifhtTask();


    }

    public static int doThirdTask(int a, int b,int c,int d){

       return a*(b+(c/d));

    }

    public static void doFourthTask(){
        byte First =7;
        byte Second = 6;
        boolean Ansver = true;

        if(First+Second<=10&&First+Second>=20){
            System.out.println(Ansver);}
        else{
            Ansver=false;
            System.out.println(Ansver);}
    }

    public static void doFifhtTask(){
        int FirstYear=4000;
        if(FirstYear %4==0){
            if(FirstYear%100!=0||FirstYear%400==0)
                System.out.println("Год является високосным");
            else{System.out.println("Год не является високосным");
        }
        }
    }
}
