package Persons;

import java.util.Scanner;

/**
 * Created by user on 20.02.2017.
 */
public class Person {
   static char [][]Mass= new char[3][3];
    static char emptiDot= (char) 6850;
   static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        Mass2();
        Maseeew();
        turnPlaer();


    }
    static void Mass2(){
        for (int a=0;a<Mass.length;a++){
            for (int b=0;b<Mass.length;b++){
                Mass[a][b]=emptiDot;
            }
        }
    }

    static void Maseeew(){
        for (int a=0; a<Mass.length;a++){
            for (int b=0; b<Mass.length;b++){
                System.out.print(Mass[a][b]+"");
            }
            System.out.println();
        }
    }

    static void turnPlaer(){
        System.out.println("Введите текст");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Вы ввели "+a+" "+b);

    }


}




